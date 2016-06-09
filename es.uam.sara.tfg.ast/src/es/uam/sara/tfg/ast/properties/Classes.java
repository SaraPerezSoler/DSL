package es.uam.sara.tfg.ast.properties;

import java.util.ArrayList;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.ast.properties.Name.Idioma;
import es.uam.sara.tfg.ast.properties.Name.Type;

public class Classes {
	
	private ArrayList<TypeDeclaration> classes;
	
	public Classes(ArrayList<TypeDeclaration> classes){
		this.classes=classes;
	}

	/*public Result<TypeDeclaration> isInheritor( ArrayList<TypeDeclaration> classes){
		if (classes==null){
			classes=this.classes;
		}
		
		Result<TypeDeclaration> result=new Result<TypeDeclaration>("is heir");
		for(TypeDeclaration c: classes){
			if (c.getSuperclassType().){
				result.addWrong(c);
			}else{
				result.addRight(c);
			}
		}
		return result;
	}*/
	
	public Result<TypeDeclaration> implement(ArrayList<TypeDeclaration> classes, int max){
		if (classes==null){
			classes=this.classes;
		}
		
		Result<TypeDeclaration> result;
		if (max<0){
			result=new Result<TypeDeclaration>("implements");
			for (TypeDeclaration c: classes){
				if (c.superInterfaceTypes().isEmpty()){
					result.addWrong(c);
				}else{
					result.addRight(c);
				}
			}
		}else{
			result=new Result<TypeDeclaration>("implements at most "+max+" interfaces");
			for (TypeDeclaration c: classes){
				if (c.superInterfaceTypes().size()>max){
					result.addWrong(c);
				}else{
					result.addRight(c);
				}
			}
		}
		return result;
	}
	
	/*public Result<TypeDeclaration> isExtended(ArrayList<TypeDeclaration> classes){
		if (classes==null){
			classes=this.classes;
		}
		
		Result<TypeDeclaration> result=new Result<TypeDeclaration>("is extended");
		
		for (TypeDeclaration c: classes){
			for (TypeDeclaration c2: this.classes){
				if (c2.getSuperclassType().getClass()==c.)
			}
		}
		
		return result;
	}*/
	
	public Result<TypeDeclaration> nameType(ArrayList<TypeDeclaration> list, Type type) {
		if (list==null){
			list=this.classes;
		}
		Result<TypeDeclaration> result= new Result<TypeDeclaration>("name type is "+type);
		
		for (TypeDeclaration c:list){
			if (Name.nameType(c.getName().toString(), type)){
				result.addRight(c);
			}else{
				result.addRight(c);
			}
		}
		
		return result;
	}

	
	public Result<TypeDeclaration> nameLike(ArrayList<TypeDeclaration> list, String name, Idioma idioma) {
		if (list==null){
			list=this.classes;
		}
		Result<TypeDeclaration> result= new Result<TypeDeclaration>("name like"+name+" language "+idioma);
		
		for (TypeDeclaration c:list){
			if (Name.nameLike(c.getName().toString(), name, idioma)){
				result.addRight(c);
			}else{
				result.addRight(c);
			}
		}
		return result;
	}

	public Result<TypeDeclaration> nameEqual(ArrayList<TypeDeclaration> list, String name) {
		if (list==null){
			list=this.classes;
		}
		Result<TypeDeclaration> result= new Result<TypeDeclaration>("name equals"+name);
		
		for (TypeDeclaration c:list){
			if (Name.nameEqual(c.getName().toString(), name)){
				result.addRight(c);
			}else{
				result.addRight(c);
			}
		}
		return result;
	}
	
	public Result<TypeDeclaration> noEmpty(ArrayList<TypeDeclaration> list){
		if (list==null){
			list=this.classes;
		}
		Result<TypeDeclaration> result= new Result<TypeDeclaration>("no empty");
		
		for (TypeDeclaration c:list){
			if (c.bodyDeclarations().isEmpty()){
				result.addWrong(c);
			}else{
				result.addRight(c);
			}
		}
		return result;
	}
	 
}
