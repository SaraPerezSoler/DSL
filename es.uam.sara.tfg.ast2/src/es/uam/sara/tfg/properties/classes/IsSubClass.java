/**
 * 
 */
package es.uam.sara.tfg.properties.classes;


import org.eclipse.jdt.core.dom.Type;
import es.uam.sara.tfg.elements.type.MClass;
import es.uam.sara.tfg.properties.StringProperty;
import es.uam.sara.tfg.properties.type.TypeString;



/**
 * @author Sara
 *
 */
public class IsSubClass extends StringProperty<MClass>{

	private TypeString of;
	/**
	 * @param analyze
	 */
	public IsSubClass(boolean no,TypeString subClass) {
		super(no);
		this.of=subClass;
	}

	public IsSubClass(boolean no) {
		super(no);
		of=null;
	}

	@Override
	public String toString() {
		String cad;
		if (no){
			cad="is not ";
		}else{
			cad="is ";
		}
		if (of==null)
			return cad +"subClass";
		else 
			return cad +"subClass of "+ of;
	}

	@Override
	public boolean checkElement(MClass t) {
		Type superClass=t.getSuperclass();
		if (of==null){
			if (superClass!=null){
				return false;
			}else{
				return true;
			}
		}else{
			if (of.compare(superClass)){
				return true;
			}else{
				return false;
			}
		}
	}

	@Override
	public void setString(String string, int i) {
		this.of.setString(string);
		
	}

	@Override
	public void deleteString(String string, int i) {
		this.of.deleteString(string);
		
	}
}
