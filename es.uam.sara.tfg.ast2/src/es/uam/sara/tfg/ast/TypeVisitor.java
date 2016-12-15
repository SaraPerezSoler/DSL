package es.uam.sara.tfg.ast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.SimpleType;

public class TypeVisitor extends ASTVisitor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HashMap<String, IsCollectionOf> isCollection= new HashMap<String, IsCollectionOf>();
	private String projectName;
	private String projectURL;
	
	
	public TypeVisitor(String projectName, String path) {
		this.projectName=projectName;
		this.projectURL=path;
	}
	
	@Override
	public boolean visit(SimpleType node){
		isCollection.put(node.toString(), isCollection(node.resolveBinding()));
		return super.visit(node);
	}
	
	
	private IsCollectionOf isCollection(ITypeBinding node){
	
		ITypeBinding[] interfaces=node.getInterfaces();
		
		if (interfaces.length==0){
			IsCollectionOf c=new IsCollectionOf();
			c.setCollection(false);
			return c;
		}
		
		for (ITypeBinding inter : interfaces){
			if (inter.getBinaryName().equals("java.util.Collection")){
				IsCollectionOf c=new IsCollectionOf();
				c.setCollection(true);
				ITypeBinding[] typeArgument= inter.getTypeArguments();
				if (typeArgument.length>0){
					c.setOf(typeArgument[0].getName());
				}
				return c;
			}else{
				IsCollectionOf c=isCollection(inter);
				if (c.isCollection()){
					return c;
				}
			}
		}
		IsCollectionOf c=new IsCollectionOf();
		c.setCollection(false);
		return c;
	}
	@Override
	public boolean visit(ParameterizedType node){
		
		isCollection.put(node.toString(), isCollection(node.resolveBinding()));
		return super.visit(node);
	}
	
	public void writeObject(){
		ObjectOutputStream salida;
		try {
			salida = new ObjectOutputStream(new FileOutputStream(projectURL+"/"+projectName+".obj"));
			salida.writeObject(this.isCollection);
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	}
	
	@SuppressWarnings("unchecked")
	public void readObject(){
		ObjectInputStream entrada;
		try {
			entrada = new ObjectInputStream(new FileInputStream(projectURL+"/"+projectName+".obj"));
			isCollection=(HashMap<String, IsCollectionOf>)entrada.readObject();
		} catch (FileNotFoundException e) {
			System.err.println("Guarde de nuevo el fichero .jrules");
			System.exit(-1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	}

	public HashMap<String, IsCollectionOf> getIsCollection() {
		return isCollection;
	}

}
