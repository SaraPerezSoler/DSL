package es.uam.sara.tfg.ast.properties;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.ast.properties.Name.Idioma;
import es.uam.sara.tfg.ast.properties.Name.Type;

public class Enumerations {

	private ArrayList<EnumDeclaration> enumerations;
	
	public Enumerations(ArrayList<EnumDeclaration> enums){
		this.enumerations=enums;
	}
	public Result<EnumDeclaration> nameType(ArrayList<EnumDeclaration> list, Type type) {
		if (list==null){
			list=this.enumerations;
		}
		Result<EnumDeclaration> result= new Result<EnumDeclaration>("name type is "+type);
		
		for (EnumDeclaration e:list){
			if (Name.nameType(e.getName().toString(), type)){
				result.addRight(e);
			}else{
				result.addRight(e);
			}
		}
		
		return result;
	}

	
	public Result<EnumDeclaration> nameLike(ArrayList<EnumDeclaration> list, String name, Idioma idioma) {
		if (list==null){
			list=this.enumerations;
		}
		Result<EnumDeclaration> result= new Result<EnumDeclaration>("name like"+name+" language "+idioma);
		
		for (EnumDeclaration e:list){
			if (Name.nameLike(e.getName().toString(), name, idioma)){
				result.addRight(e);
			}else{
				result.addRight(e);
			}
		}
		return result;
	}

	public Result<EnumDeclaration> nameEqual(ArrayList<EnumDeclaration> list, String name) {
		if (list==null){
			list=this.enumerations;
		}
		Result<EnumDeclaration> result= new Result<EnumDeclaration>("name equals"+name);
		
		for (EnumDeclaration e:list){
			if (Name.nameEqual(e.getName().toString(), name)){
				result.addRight(e);
			}else{
				result.addRight(e);
			}
		}
		return result;
	}
	
	public Result<EnumDeclaration> noEmpty(ArrayList<EnumDeclaration> list){
		if (list==null){
			list=this.enumerations;
		}
		Result<EnumDeclaration> result= new Result<EnumDeclaration>("no empty");
		
		for (EnumDeclaration e: list){
			if (e.bodyDeclarations().isEmpty() && e.enumConstants().isEmpty()){
				result.addWrong(e);
			}else{
				result.addRight(e);
			}
		}
		return result;
	}
	
	public Result<EnumDeclaration> JavaDoc (ArrayList<EnumDeclaration> list, JavaDocPropertie jdp){
		if (list==null){
			list=this.enumerations;
		}
		Result<EnumDeclaration> result= new Result<EnumDeclaration>(jdp.generateStringPropertie());
		
		for (EnumDeclaration e:list){
			if (jdp.javaDoc(e.getJavadoc())){
				result.addRight(e);
			}else{
				result.addRight(e);
			}
		}
		return result;
	}
}
