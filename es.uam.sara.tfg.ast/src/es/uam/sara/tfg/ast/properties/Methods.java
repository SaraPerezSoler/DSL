package es.uam.sara.tfg.ast.properties;

import java.util.ArrayList;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

import es.uam.sara.tfg.ast.properties.Name.Idioma;
import es.uam.sara.tfg.ast.properties.Name.Type;

public class Methods {

	private ArrayList<MethodDeclaration> methods;
	
	public Methods(ArrayList<MethodDeclaration> methods){
		this.methods=methods;
	}
	
	public Result<MethodDeclaration> isConstructor(ArrayList<MethodDeclaration> methods){
		if (methods==null){
			methods=this.methods;
		}
		Result<MethodDeclaration> result=new Result<MethodDeclaration>("is constructor");
		for (MethodDeclaration m: methods){
			if (m.isConstructor()){
				result.addRight(m);
			}else{
				result.addWrong(m);
			}
		}
		return result;
	}
	
	public Result<MethodDeclaration> parametres (ArrayList<MethodDeclaration> methods,int number, ArrayList<String> type){
		if (methods==null){
			methods=this.methods;
		}
		Result<MethodDeclaration> result=new Result<MethodDeclaration>("number of parameters is" +number);
		for (MethodDeclaration m: methods){
			if (m.parameters().size()!=number){
				result.addWrong(m);
			}else{
				if (type!=null){
					result.addPropertie("and types are "+type);
					int i=0;
					boolean flag=true;
					for (Object p:m.parameters()){
						if (p instanceof SingleVariableDeclaration){
							if(!(((SingleVariableDeclaration) p).getType().toString().equals(type.get(i)))){
								flag=false;
							}
						}
						i++;
					}
					if (flag){
						result.addRight(m);
					}else{
						result.addWrong(m);
					}
				}else{
					result.addRight(m);
				}
			}
		}
		return result;
	}
	
	public Result<MethodDeclaration> returns (ArrayList<MethodDeclaration> methods, String returnType){
		if (methods==null){
			methods=this.methods;
		}
		Result<MethodDeclaration> result=new Result<MethodDeclaration>("return type is " +returnType);
		for (MethodDeclaration m: methods){
			if (m.getReturnType2().toString().equals(returnType)){
				result.addRight(m);
			}else{
				result.addWrong(m);
			}
		}
		
		
		return result;
	}
	
	public Result<MethodDeclaration> nameType(ArrayList<MethodDeclaration> list, Type type) {
		if (list==null){
			list=this.methods;
		}
		Result<MethodDeclaration> result= new Result<MethodDeclaration>("name type is "+type);
		
		for (MethodDeclaration m:list){
			if (Name.nameType(m.getName().toString(), type)){
				result.addRight(m);
			}else{
				result.addRight(m);
			}
		}
		
		return result;
	}

	
	public Result<MethodDeclaration> nameLike(ArrayList<MethodDeclaration> list, String name, Idioma idioma) {
		if (list==null){
			list=this.methods;
		}
		Result<MethodDeclaration> result= new Result<MethodDeclaration>("name like"+name+" language "+idioma);
		
		for (MethodDeclaration m:list){
			if (Name.nameLike(m.getName().toString(), name, idioma)){
				result.addRight(m);
			}else{
				result.addRight(m);
			}
		}
		return result;
	}

	public Result<MethodDeclaration> nameEqual(ArrayList<MethodDeclaration> list, String name) {
		if (list==null){
			list=this.methods;
		}
		Result<MethodDeclaration> result= new Result<MethodDeclaration>("name equals"+name);
		
		for (MethodDeclaration m:list){
			if (Name.nameEqual(m.getName().toString(), name)){
				result.addRight(m);
			}else{
				result.addRight(m);
			}
		}
		return result;
	}
	
	public Result<MethodDeclaration> noEmpty(ArrayList<MethodDeclaration> list){
		if (list==null){
			list=this.methods;
		}
		Result<MethodDeclaration> result= new Result<MethodDeclaration>("no empty");
		
		for (MethodDeclaration m: list){
			if (m.getBody().statements().isEmpty()){
				result.addWrong(m);
			}else{
				result.addRight(m);
			}
		}
		
		return result;
	}
}
