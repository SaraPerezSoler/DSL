package es.uam.sara.tfg.properties.all;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import es.uam.sara.tfg.elements.JavaElement;
import es.uam.sara.tfg.properties.BlendModifiers;
import es.uam.sara.tfg.properties.Properties;
import es.uam.sara.tfg.properties.BlendModifiers.Acceso;

public class Modifiers<T extends JavaElement> extends Properties<T>{


	private ArrayList<BlendModifiers> blends=new ArrayList<BlendModifiers>();
	public void addBlend(Acceso acceso, boolean static_, boolean final_, boolean abstract_, boolean default_, boolean synchronized_){
		blends.add(new BlendModifiers(acceso, static_, final_, abstract_,default_, synchronized_));
	}
	
	public boolean modifiers(List<Modifier> list){
		BlendModifiers nuevo= createBlend(list);
		for (BlendModifiers b: this.blends){
			if (b.compara(nuevo)==true){
				return true;
			}
		}
		return false;
		
	}
	
	public boolean check(BlendModifiers bd){
		for (BlendModifiers b: this.blends){
			if (b.compara(bd)==true){
				return true;
			}
		}
		return false;
	}
	private static BlendModifiers createBlend(List<Modifier> list){
		Acceso acceso=Acceso.NOTHING;
		boolean static_=false; 
		boolean final_=false; 
		boolean abstract_=false; 
		boolean default_=false; 
		boolean synchronized_=false;
		
		for (Modifier m:list){
			if (m.isPublic()){
				acceso=Acceso.PUBLIC;
			}else if (m.isPrivate()){
				acceso=Acceso.PRIVATE;
			}else if (m.isProtected()){
				acceso=Acceso.PROTECTED;
			}else if(m.isStatic()){
				static_=true;
			}else if(m.isFinal()){
				final_=true;
			}else if(m.isAbstract()){
				abstract_=true;
			}else if (m.isDefault()){
				default_=true;
			}else if(m.isSynchronized()){
				synchronized_=true;
			}
		}
		return new BlendModifiers(acceso, static_, final_, abstract_,default_, synchronized_);
	}

	@Override
	public String toString() {
		String cad="modifiers: [ ";
		cad+="("+blends.get(0).toString()+") ";
		for (int i=1; i<blends.size(); i++){
			cad+="or ("+blends.get(i).toString()+") ";
		}
		cad+="]";
		return cad;
	}
	
	public static List<Modifier> getList(BodyDeclaration bd) {
		List<Modifier> mList = new ArrayList<Modifier>();
		for (Object o : bd.modifiers()) {
			if (o instanceof Modifier) {
				mList.add((Modifier) o);
			}
		}
		return mList;
	}
	public static BlendModifiers getBlend(BodyDeclaration bd){
		return createBlend(getList(bd));
	}

	@Override
	public boolean checkElement(T analyze) {
		return check(analyze.getModifiers());
	}

	
}
