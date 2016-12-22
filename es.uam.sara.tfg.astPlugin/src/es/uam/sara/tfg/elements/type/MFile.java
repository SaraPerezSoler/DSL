package es.uam.sara.tfg.elements.type;

import java.util.List;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.ICanEmpty;
import es.uam.sara.tfg.elements.IPosicionable;


public class MFile implements Container, IPosicionable, ICanEmpty{

	private UnitVisitor uv;
	
	public MFile(UnitVisitor uv) {
		this.uv=uv;	
	}

	@Override
	public String getName() {
		return uv.getNameFile();
	}

	public  List<MAttribute> getAttributes(){
		return uv.getAttributes();
	}
	public  List<MClass> getClasses(){
		return uv.getClasses();
	}
	
	public  List<MInterface> getInterfaces(){
		return uv.getInterfaces();
	}
	public  List<MEnumeration> getEnumerations(){
		return uv.getEnumerations();
	}
	public  List<MMethod> getMethods(){
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

		if (object != null && object instanceof MFile) {
			sameSame = this.uv.equals(((MFile)object).uv);
		}

		return sameSame;
	}

	@Override
	public String getStringType() {
		return "";
	}
}
