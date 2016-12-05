package es.uam.sara.tfg.properties.all;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.properties.StringProperty;

public class NameOperation<T extends IElements> extends StringProperty<T> {

	public enum Operation {
		EQUAL, LIKE, START, END, CONTAIN, UNDEFINE
	}

	public static final int ENGLISH = 1;
	public static final int SPANISH = 2;
	public static final int EMPTY = 0;

	private Operation op = Operation.UNDEFINE;
	private String other;
	private int idioma;

	public NameOperation(boolean no, Operation op, String cad, int idioma) {
		super(no);
		this.op = op;
		this.other = cad;
		this.idioma = idioma;
	}
	public NameOperation(boolean no, Operation op, int idioma) {
		super(no);
		this.op = op;
		this.idioma = idioma;
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

			// Buscamos la división donde se encuentran los sinonimos
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

			// Buscamos la división donde se encuentran los sinonimos
			while ((linea.compareTo("<div id=\"article\">") != 0)) {
				if (linea.contains("No se ha encontrado") == true) {
					System.out.println("Sin sinonimo");
					return null;
				}
				linea = in.readLine();
			}
			linea = in.readLine();

			linea = linea.replaceAll("Ã¡", "a");
			linea = linea.replaceAll("Ã©", "e");
			linea = linea.replaceAll("Ã­", "i");
			linea = linea.replaceAll("Ã³", "o");
			linea = linea.replaceAll("Ãº", "u");
			linea = linea.replaceAll("Ã±", "ñ");//////////

			// linea.contains("ó");
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

	@Override
	public String toString() {
		String cad="name ";
		if (no){
			cad+="don't ";
		}
		cad+=this.op.toString().toLowerCase()+" "+this.other;
		return cad;
	}

	@Override
	public boolean checkElement(T analyze) {
		return checkNameOperation(analyze.getName());
	}
	@Override
	public void setString(String string, int i) {
		this.other = string;
		
	}
	@Override
	public void deleteString(String string, int i) {
		this.other="";
		
	}


}
