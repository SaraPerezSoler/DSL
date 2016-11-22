package es.uam.sara.tfg.elements;

import java.util.List;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;

import es.uam.sara.tfg.ast.UnitVisitor;


public class File extends Elements{

	private UnitVisitor uv;
	
	public File(UnitVisitor uv) {
		super(null);
	
	}

	@Override
	public String getName() {
		return uv.getNameFile();
	}

	@Override
	public BodyDeclaration getBodyDeclarations() {
		return null;
	}
	

	public CompilationUnit getASTNode() {
		return uv.getComp();
	}

	public  List<Attribute> getAttributes(){
		return uv.getAttributes();
	}
	public  List<ClassInterface> getClasses(){
		return uv.getClasses();
	}
	
	public  List<ClassInterface> getInterfaces(){
		return uv.getInterfaces();
	}
	public  List<Enumeration> getEnumerations(){
		return uv.getEnumerations();
	}
	public  List<Method> getMethods(){
		return uv.getMethods();
	}
	@Override
	public UnitVisitor getVisitor() {
		return this.uv;
	}
	
	public boolean isEmpty() {
		return uv.isEmpty();
	}

	@Override
	public String toString() {
		
		return "The file "+getName()+"\n";
	}
}
