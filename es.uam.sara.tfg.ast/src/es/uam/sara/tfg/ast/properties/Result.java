package es.uam.sara.tfg.ast.properties;

import java.util.ArrayList;

public class Result <T>{

	private ArrayList<T> right ;
	private ArrayList<T> wrong;
	private String propertie;
	
	public Result(String propertie){
		right=new ArrayList<T>();
		wrong=new ArrayList<T>();
		this.propertie=propertie;
	}
	
	public void addRight (T obj){
		right.add(obj);
	}
	
	public ArrayList<T> getRight(){
		return right;
	}
	
	public void addWrong (T obj){
		wrong.add(obj);
	}
	
	public ArrayList<T> getWrong(){
		return wrong;
	}
	
	public void addPropertie(String prop){
		propertie=propertie+" "+prop;
	}
	public String getPropertie(){
		return propertie;
	}
}
