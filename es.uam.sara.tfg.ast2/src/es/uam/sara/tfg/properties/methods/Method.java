/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.Properties;


/**
 * @author Sara
 *
 */
public abstract class Method extends Properties<MethodDeclaration> {

	public Method() {
		super();
	}

	public String printRight(){
		String cad="";
		List<MethodDeclaration> right=super.getRight();
		for (MethodDeclaration meth: right){
			UnitVisitor uv=Visitors.getVisitor(meth);
			cad+="In file "+uv.getNameFile()+" the method "+meth.getName() +" (line:" +uv.getLineNumber(meth.getStartPosition())+")  satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<MethodDeclaration> wrong=super.getWrong();
		for (MethodDeclaration meth: wrong){
			UnitVisitor uv=Visitors.getVisitor(meth);
			cad+="In file "+uv.getNameFile()+" the method "+meth.getName() +" (line:" +uv.getLineNumber(meth.getStartPosition())+") not satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
}
