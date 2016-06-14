package es.uam.sara.tfg.ast.properties;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import es.uam.sara.tfg.ast.properties.Name.Idioma;
import es.uam.sara.tfg.ast.properties.Name.Type;

public class Attributes{

	private ArrayList<FieldDeclaration> attribuites;
	
	public Attributes (ArrayList<FieldDeclaration> att){
		this.attribuites=att;
	}
	
	public Result<FieldDeclaration> type(ArrayList<FieldDeclaration> att, String type){
		if (att==null){
			att=this.attribuites;
		}
		Result<FieldDeclaration> result= new Result<FieldDeclaration>("Type of attribute is "+type);
		for (FieldDeclaration a: att){
			if (a.getType().toString().equals(type)){
				result.addRight(a);
			}else{
				result.addWrong(a);
			}
		}
		return result;
	}
	
	public Result<FieldDeclaration> initialize (ArrayList<FieldDeclaration> att){
		if (att==null){
			att=this.attribuites;
		}
		Result<FieldDeclaration> result= new Result<FieldDeclaration>("is initialize");
		for (FieldDeclaration a: att){
			if(a.fragments().get(0) instanceof VariableDeclarationFragment){
				VariableDeclarationFragment declaration=(VariableDeclarationFragment)a.fragments().get(0);
				if (declaration.getInitializer()==null){
					result.addWrong(a);
				}else{
					result.addRight(a);
				}
			}
		}
		return result;
	}

	public Result<FieldDeclaration> nameType(ArrayList<FieldDeclaration> list, Type type) {
		if (list==null){
			list=this.attribuites;
		}
		Result<FieldDeclaration> result= new Result<FieldDeclaration>("name type is "+type);
		
		for (FieldDeclaration a:list){
			if(a.fragments().get(0) instanceof VariableDeclarationFragment){
				VariableDeclarationFragment declaration=(VariableDeclarationFragment)a.fragments().get(0);
				if (Name.nameType(declaration.getName().toString(), type)){
					result.addRight(a);
				}else{
					result.addRight(a);
				}
			}
		}
		
		return result;
	}

	
	public Result<FieldDeclaration> nameLike(ArrayList<FieldDeclaration> list, String name, Idioma idioma) {
		if (list==null){
			list=this.attribuites;
		}
		Result<FieldDeclaration> result= new Result<FieldDeclaration>("name like"+name+" language "+idioma);
		
		for (FieldDeclaration a:list){
			if(a.fragments().get(0) instanceof VariableDeclarationFragment){
				VariableDeclarationFragment declaration=(VariableDeclarationFragment)a.fragments().get(0);
				if (Name.nameLike(declaration.getName().toString(), name, idioma)){
					result.addRight(a);
				}else{
					result.addWrong(a);
				}
			}
		}
		return result;
	}

	public Result<FieldDeclaration> nameEqual(ArrayList<FieldDeclaration> list, String name) {
		if (list==null){
			list=this.attribuites;
		}
		Result<FieldDeclaration> result= new Result<FieldDeclaration>("name equals"+name);
		
		for (FieldDeclaration a:list){
			if(a.fragments().get(0) instanceof VariableDeclarationFragment){
				VariableDeclarationFragment declaration=(VariableDeclarationFragment)a.fragments().get(0);
				if (Name.nameEqual(declaration.getName().toString(), name)){
					result.addRight(a);
				}else{
					result.addWrong(a);
				}
			}
		}
		return result;
	}
	
	public Result<FieldDeclaration> JavaDoc (ArrayList<FieldDeclaration> list, JavaDocPropertie jdp){
		if (list==null){
			list=this.attribuites;
		}
		Result<FieldDeclaration> result= new Result<FieldDeclaration>(jdp.generateStringPropertie());
		
		for (FieldDeclaration a:list){
			if (jdp.javaDoc(a.getJavadoc())){
				result.addRight(a);
			}else{
				result.addRight(a);
			}
		}
		return result;
	}
	
	public Result<FieldDeclaration> Modifiers(ArrayList<FieldDeclaration> list, Modifiers m){
		if (list==null){
			list=this.attribuites;
		}
		Result<FieldDeclaration> result= new Result<FieldDeclaration>("");
		
		for (FieldDeclaration a:list){
			ArrayList<Modifier> mList=new ArrayList<Modifier>();
			for (Object o:a.modifiers()){
				if (o instanceof Modifier){
					mList.add((Modifier) o);
				}
			}
			if (m.modifiers(mList)){
				result.addRight(a);
			}else{
				result.addWrong(a);
			}
		}
		return result;
	}
}
