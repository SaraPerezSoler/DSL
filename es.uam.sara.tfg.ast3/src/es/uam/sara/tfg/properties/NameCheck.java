package es.uam.sara.tfg.properties;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class NameCheck {

	public enum Operation {
		EQUAL, LIKE, START, END, CONTAIN, UNDEFINE
	}

	public enum Type {
		UPPER_CAMEL_CASE, LOWER_CAMEL_CASE, UPPER_CASE, LOWER_CASE, START_UPPER_CASE, UNDEFINE
	}
	

	public static final int ENGLISH = 1;
	public static final int SPANISH = 2;
	public static final int EMPTY = 0;

	private Operation op = Operation.UNDEFINE;
	private String other;
	private int idioma;

	private Type type = Type.UNDEFINE;

	public NameCheck(Type type) {
		this.type = type;
	}

	public NameCheck(Operation op, String cad, int idioma) {
		try {
			if (op == NameCheck.Operation.LIKE) {
				if (idioma != NameCheck.ENGLISH && idioma != NameCheck.SPANISH) {
					throw new PropertiesException("Cod 02: El operando Like debe tener el valor idioma definido");
				}
			}
		} catch (PropertiesException e) {
			e.printStackTrace();
		}
		this.op = op;
		this.other = cad;
		this.idioma = idioma;
	}

	public boolean checkNameOperation(ASTNode node) {
		return checkNameOperation(getName(node));
	}
	
	public static String getName(ASTNode node){
		if (node instanceof AbstractTypeDeclaration){
			return ((AbstractTypeDeclaration)node).getName().toString();
		}else if (node instanceof MethodDeclaration){
			return ((MethodDeclaration)node).getName().toString();
		}else if (node instanceof FieldDeclaration){
			FieldDeclaration elem=(FieldDeclaration) node;
			if (elem.fragments().get(0) instanceof VariableDeclarationFragment) {
				VariableDeclarationFragment declaration = (VariableDeclarationFragment) elem.fragments().get(0);
				return declaration.getName().toString();
			}
		}
			
		return "";
	}

	public boolean checkNameOperation(String name) {
		switch (op) {
		case EQUAL:
			return nameEqual(name, other);
		case LIKE:
			return nameLike(name, other, idioma);
		case START:
			return nameStart(name, other);
		case END:
			return nameEnd(name, other);
		case CONTAIN:
			return nameContein(name, other);
		default:
			return true;
		}
	}

	public boolean checkNameType(ASTNode node) {
		return checkNameType(getName(node));
	}

	public boolean checkNameType(String name) {
		switch (type) {
		case UPPER_CAMEL_CASE:
			return upperCamelCase(name);
		case LOWER_CAMEL_CASE:
			return lowerCamelCase(name);
		case UPPER_CASE:
			return upperCase(name);
		case LOWER_CASE:
			return lowerCase(name);
		case START_UPPER_CASE:
			return startUpperCase(name);
		default:
			return true;
		}
	}

	private boolean upperCamelCase(String name) {
		char[] nameArray = name.toCharArray();
		if (Character.isUpperCase(nameArray[0])) {
			for (int i = 1; i < nameArray.length; i++) {
				if (!(Character.isUpperCase(nameArray[i]) || Character.isLowerCase(nameArray[i])
						|| Character.isDigit(nameArray[i]))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	private boolean lowerCamelCase(String name) {
		char[] nameArray = name.toCharArray();
		if (Character.isLowerCase(nameArray[0])) {
			for (int i = 1; i < nameArray.length; i++) {
				if (!(Character.isUpperCase(nameArray[i]) || Character.isLowerCase(nameArray[i]))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	private boolean upperCase(String name) {
		char[] nameArray = name.toCharArray();
		for (int i = 0; i < nameArray.length; i++) {
			if (Character.isLetter(nameArray[i])) {
				if (!Character.isUpperCase(nameArray[i])) {
					return false;
				}
			}
		}
		return true;

	}

	private boolean lowerCase(String name) {
		char[] nameArray = name.toCharArray();
		for (int i = 0; i < nameArray.length; i++) {
			if (Character.isLetter(nameArray[i])) {
				if (!Character.isLowerCase(nameArray[i])) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean startUpperCase(String name) {
		char[] nameArray = name.toCharArray();
		if (!Character.isUpperCase(nameArray[0])) {
			return false;
		}
		return true;
	}

	private boolean nameLike(String name, String name2, int idioma) {
		List<String> sinonimos = null;
		if (name.compareToIgnoreCase(name2) == 0) {
			return true;
		}
		switch (idioma) {
		case ENGLISH:
			sinonimos = synonyms(name2);
			break;

		default:
			sinonimos = sinonimos(name2);
			break;
		}
		;

		if (sinonimos == null) {
			return false;
		}
		for (String s : sinonimos) {
			if (name.compareToIgnoreCase(s) == 0) {
				return true;
			}
		}
		return false;
	}

	private List<String> synonyms(String name) {
		try {

			URL url = new URL("http://www.wordreference.com/synonyms/" + name);
			URLConnection con = url.openConnection();

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String linea = in.readLine();

			// Buscamos la divisi�n donde se encuentran los sinonimos
			while ((linea.compareTo("<div id=\"article\">") != 0)) {
				if (linea.contains("No thesaurus entry found for") == true) {
					System.out.println("Sin sinonimo");
					return null;
				}
				linea = in.readLine();
			}
			linea = in.readLine();

			String palabras[] = linea.split("<u><b>" + name + "</b></u>");
			String sinonimos[] = palabras[1].split("title=\"\">");
			ArrayList<String> defSinonimo = new ArrayList<String>();
			for (int i = 1; i < sinonimos.length; i++) {
				sinonimos[i] = sinonimos[i].split("<")[0];
				defSinonimo.add(sinonimos[i]);
			}
			return defSinonimo;
		} catch (UnknownHostException e) {
			System.out.println("Imposible conectar con la web");
		} catch (IOException e2) {
			System.out.println(e2);
		}

		return null;
	}

	private List<String> sinonimos(String name) {
		try {
			URL url = new URL("http://www.wordreference.com/sinonimos/" + name);
			URLConnection con = url.openConnection();

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String linea = in.readLine();

			// Buscamos la divisi�n donde se encuentran los sinonimos
			while ((linea.compareTo("<div id=\"article\">") != 0)) {
				if (linea.contains("No se ha encontrado") == true) {
					System.out.println("Sin sinonimo");
					return null;
				}
				linea = in.readLine();
			}
			linea = in.readLine();

			linea = linea.replaceAll("á", "a");
			linea = linea.replaceAll("é", "e");
			linea = linea.replaceAll("í", "i");
			linea = linea.replaceAll("ó", "o");
			linea = linea.replaceAll("ú", "u");
			linea = linea.replaceAll("ñ", "�");//////////

			// linea.contains("�");
			String palabras[] = linea.split("<h3>");
			// System.out.println(palabras[1]);
			String sinonimos[] = palabras[1].split("<li>");
			ArrayList<String> defSinonimo = new ArrayList<String>();
			for (int i = 1; i < sinonimos.length; i++) {
				sinonimos[i] = sinonimos[i].split("</li>")[0];
				if (!(sinonimos[i].contains("Antonimos:"))) {
					String aux[] = sinonimos[i].split(", ");
					for (String a : aux) {
						defSinonimo.add(a);
					}

				}
			}
			return defSinonimo;
		} catch (UnknownHostException e) {
			System.out.println("Imposible conectar con la web");
		} catch (IOException e2) {
			System.out.println(e2);
		}
		return null;
	}

	private boolean nameEqual(String name, String name2) {
		if (name.compareToIgnoreCase(name2) == 0) {
			return true;
		}
		return false;
	}

	private boolean nameStart(String name, String prefix) {
		if (name.toLowerCase().startsWith(prefix.toLowerCase())) {
			return true;
		}
		return false;
	}

	private boolean nameEnd(String name, String suffix) {
		if (name.toLowerCase().endsWith(suffix.toLowerCase())) {
			return true;
		}
		return false;
	}

	private boolean nameContein(String name, String text) {
		if (name.toLowerCase().contains(text.toLowerCase())) {
			return true;
		}
		return false;
	}

	public Operation getOp() {
		return op;
	}

	public String getOther() {
		return other;
	}

	public int getIdioma() {
		return idioma;
	}

	public Type getType() {
		return type;
	}

}
