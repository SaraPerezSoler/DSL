package es.uam.sara.tfg.ast.properties;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.PackageDeclaration;
import es.uam.sara.tfg.ast.properties.Name.Idioma;
import es.uam.sara.tfg.ast.properties.Name.Type;

public class Packages {
	private ArrayList<PackageDeclaration> packages;
	
	public Packages(ArrayList<PackageDeclaration> pack){
		this.packages=pack;
	}
	public Result<PackageDeclaration> nameType(ArrayList<PackageDeclaration> list, Type type) {
		if (list==null){
			list=this.packages;
		}
		Result<PackageDeclaration> result= new Result<PackageDeclaration>("name type is "+type);
		
		for (PackageDeclaration p:list){
			if (Name.nameType(p.getName().toString(), type)){
				result.addRight(p);
			}else{
				result.addRight(p);
			}
		}
		
		return result;
	}

	
	public Result<PackageDeclaration> nameLike(ArrayList<PackageDeclaration> list, String name, Idioma idioma) {
		if (list==null){
			list=this.packages;
		}
		Result<PackageDeclaration> result= new Result<PackageDeclaration>("name like"+name+" language "+idioma);
		
		for (PackageDeclaration p:list){
			if (Name.nameLike(p.getName().toString(), name, idioma)){
				result.addRight(p);
			}else{
				result.addRight(p);
			}
		}
		return result;
	}

	public Result<PackageDeclaration> nameEqual(ArrayList<PackageDeclaration> list, String name) {
		if (list==null){
			list=this.packages;
		}
		Result<PackageDeclaration> result= new Result<PackageDeclaration>("name equals"+name);
		
		for (PackageDeclaration p:list){
			if (Name.nameEqual(p.getName().toString(), name)){
				result.addRight(p);
			}else{
				result.addRight(p);
			}
		}
		return result;
	}
	
	public Result<PackageDeclaration> JavaDoc (ArrayList<PackageDeclaration> list, JavaDocPropertie jdp){
		if (list==null){
			list=this.packages;
		}
		Result<PackageDeclaration> result= new Result<PackageDeclaration>(jdp.generateStringPropertie());
		
		for (PackageDeclaration p:list){
			if (jdp.javaDoc(p.getJavadoc())){
				result.addRight(p);
			}else{
				result.addRight(p);
			}
		}
		return result;
	}
	
	
}
