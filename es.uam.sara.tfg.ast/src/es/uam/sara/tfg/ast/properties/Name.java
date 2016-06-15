package es.uam.sara.tfg.ast.properties;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Name {

	public int numero;
	public enum Type {
		upperCamelCase, lowerCamelCase, upperCase, lowerCase, startUpperCase
	}
	public enum Idioma{
		ENGLISH, ESPANIOL
	}
	public static  boolean nameType (String name, Type type){
		switch (type) {
		case upperCamelCase:
			return  upperCamelCase (name);
		case lowerCamelCase:
			
			return lowerCamelCase(name);
		case upperCase:
			
			return upperCase(name);
		case lowerCase:
			
			return lowerCase(name);
		default:
			return startUpperCase(name);
		}
	}
	
	private static boolean upperCamelCase (String name){
		char [] nameArray= name.toCharArray();
		if (upperLetter(nameArray[0])){
			for (int i=1; i<nameArray.length; i++){
				if (!(upperLetter(nameArray[i]) || lowerLetter(nameArray[i]))){
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}
	
	private static boolean lowerCamelCase (String name){
		char [] nameArray= name.toCharArray();
		if (lowerLetter(nameArray[0])){
			for (int i=1; i<nameArray.length; i++){
				if (!(upperLetter(nameArray[i]) || lowerLetter(nameArray[i]))){
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}
	
	private static boolean upperCase (String name){
		char [] nameArray= name.toCharArray();
		for (int i=0; i<nameArray.length; i++){
			if (nameArray[i]!='_' && nameArray[i]!='$' && !isNumber(nameArray[i])){
				if (!upperLetter(nameArray[i])){
					return false;
				}
			}
		}
		return true;

	}
	
	private static boolean lowerCase (String name){
		char [] nameArray= name.toCharArray();
		for (int i=0; i<nameArray.length; i++){
			if (nameArray[i]!='_' && nameArray[i]!='$' && !isNumber(nameArray[i])){
				if (!lowerLetter(nameArray[i])){
					return false;
				}
			}
		}
		return true;
	}
	private static boolean startUpperCase(String name){
		char [] nameArray= name.toCharArray();
		if (!upperLetter(nameArray[0])){
			return false;
		}
		return true;
	}
	
	private static boolean isNumber (char a){
		if (a>=0 && a<=9){
			return true;
		}
		return false;
	}
	private static boolean upperLetter (char a){
		if (a>='A' && a<='Z'){
			return true;
		}
		return false;
	}
	private static boolean lowerLetter (char a){
		if (a>='a' && a<='z'){
			return true;
		}
		return false;
	}
	
	
	public static boolean nameLike (String name, String name2, Idioma idioma){
		ArrayList<String> sinonimos=null;
		if (name.compareToIgnoreCase(name2)==0){
			return true;
		}
		switch (idioma) {
		case ENGLISH:
			sinonimos=synonyms (name2);
			break;

		default:
			sinonimos=sinonimos (name2);
			break;
		};
		
		if (sinonimos==null){
			return false;
		}
		for (String s: sinonimos){
			if (name.compareToIgnoreCase(s)==0){
				return true;
			}
		}
		return false;
	}
	
	
	private static ArrayList<String> synonyms (String name){
		try {
			String word="book";
			URL url = new URL("http://www.wordreference.com/synonyms/"+word);
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
		
			String palabras[] = linea.split("<u><b>"+word+"</b></u>");
			String sinonimos[] = palabras[1].split("title=\"\">");
			ArrayList<String> defSinonimo = new ArrayList<String>();
			for (int i = 1; i < sinonimos.length; i++) {
				sinonimos[i] = sinonimos[i].split("<")[0];
				defSinonimo.add(sinonimos[i]);
			}

			return defSinonimo;
		} catch (UnknownHostException e) {
			System.out.println("Imposible conectar con la web");
		}catch (IOException e2){
			System.out.println (e2);
		}
		return null;
	}
	private static ArrayList<String> sinonimos (String name){
		try {
			URL url = new URL("http://www.wordreference.com/sinonimos/"+name);
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
		}  catch (UnknownHostException e) {
			System.out.println("Imposible conectar con la web");
		}catch (IOException e2){
			System.out.println (e2);
		}
		return null;
	}
	public static boolean nameEqual(String name, String name2){
		if (name.compareToIgnoreCase(name2)==0){
			return true;
		}
		return false;
	}
}
