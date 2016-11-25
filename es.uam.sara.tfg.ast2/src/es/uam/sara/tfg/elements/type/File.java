package es.uam.sara.tfg.elements.type;

import java.util.List;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.ICanEmpty;
import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.elements.IPosicionable;


public class File implements IElements, Container, IPosicionable, ICanEmpty{

	private UnitVisitor uv;
	
	public File(UnitVisitor uv) {
		this.uv=uv;	
	}

	@Override
	public String getName() {
		return uv.getNameFile();
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

	@Override
	public int getStartLine() {
		return 1;
	}

	@Override
	public int getEndLine() {
		return uv.getLineNumber(uv.getComp().getStartPosition() + uv.getComp().getLength() - 1);
	}
	
	@Override
	public boolean equals(Object object) {
		boolean sameSame = false;

		if (object != null && object instanceof File) {
			sameSame = this.uv.equals(((File)object).uv);
		}

		return sameSame;
	}
}
