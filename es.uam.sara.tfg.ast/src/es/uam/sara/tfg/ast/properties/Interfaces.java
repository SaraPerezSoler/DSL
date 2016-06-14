package es.uam.sara.tfg.ast.properties;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.properties.Name.Idioma;
import es.uam.sara.tfg.ast.properties.Name.Type;

public class Interfaces {
	
	private ArrayList<TypeDeclaration> interfaces;
	
	public Interfaces(ArrayList<TypeDeclaration> inter){
		this.interfaces=inter;
	}
	public Result<TypeDeclaration> nameType(ArrayList<TypeDeclaration> list, Type type) {
		if (list==null){
			list=this.interfaces;
		}
		Result<TypeDeclaration> result= new Result<TypeDeclaration>("name type is "+type);
		
		for (TypeDeclaration i:list){
			if (Name.nameType(i.getName().toString(), type)){
				result.addRight(i);
			}else{
				result.addRight(i);
			}
		}
		
		return result;
	}

	
	public Result<TypeDeclaration> nameLike(ArrayList<TypeDeclaration> list, String name, Idioma idioma) {
		if (list==null){
			list=this.interfaces;
		}
		Result<TypeDeclaration> result= new Result<TypeDeclaration>("name like"+name+" language "+idioma);
		
		for (TypeDeclaration i:list){
			if (Name.nameLike(i.getName().toString(), name, idioma)){
				result.addRight(i);
			}else{
				result.addRight(i);
			}
		}
		return result;
	}

	public Result<TypeDeclaration> nameEqual(ArrayList<TypeDeclaration> list, String name) {
		if (list==null){
			list=this.interfaces;
		}
		Result<TypeDeclaration> result= new Result<TypeDeclaration>("name equals"+name);
		
		for (TypeDeclaration i:list){
			if (Name.nameEqual(i.getName().toString(), name)){
				result.addRight(i);
			}else{
				result.addRight(i);
			}
		}
		return result;
	}
	
	public Result<TypeDeclaration> noEmpty(ArrayList<TypeDeclaration> list){
		if (list==null){
			list=this.interfaces;
		}
		Result<TypeDeclaration> result= new Result<TypeDeclaration>("no empty");
		
		for (TypeDeclaration i:list){
			if (i.bodyDeclarations().isEmpty()){
				result.addWrong(i);
			}else{
				result.addRight(i);
			}
		}
		return result;
	}
	
	public Result<TypeDeclaration> JavaDoc (ArrayList<TypeDeclaration> list, JavaDocPropertie jdp){
		if (list==null){
			list=this.interfaces;
		}
		Result<TypeDeclaration> result= new Result<TypeDeclaration>(jdp.generateStringPropertie());
		
		for (TypeDeclaration i:list){
			if (jdp.javaDoc(i.getJavadoc())){
				result.addRight(i);
			}else{
				result.addRight(i);
			}
		}
		return result;
	}
	
	public Result<TypeDeclaration> Modifiers(ArrayList<TypeDeclaration> list, Modifiers m){
		if (list==null){
			list=this.interfaces;
		}
		Result<TypeDeclaration> result= new Result<TypeDeclaration>("");
		
		for (TypeDeclaration i:list){
			ArrayList<Modifier> mList=new ArrayList<Modifier>();
			for (Object o:i.modifiers()){
				if (o instanceof Modifier){
					mList.add((Modifier) o);
				}
			}
			if (m.modifiers(mList)){
				result.addRight(i);
			}else{
				result.addWrong(i);
			}
		}
		return result;
	}
}
