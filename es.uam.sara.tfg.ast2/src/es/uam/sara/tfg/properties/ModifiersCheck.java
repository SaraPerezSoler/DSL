package es.uam.sara.tfg.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Modifier;

public class ModifiersCheck {

	private ArrayList<BlendModifiers> blends=new ArrayList<BlendModifiers>();
	public void addBlend(String acceso, boolean static_, boolean final_, boolean abstract_, boolean synchronized_){
		blends.add(new BlendModifiers(acceso, static_, final_, abstract_, synchronized_));
	}
	
	boolean modifiers(List<Modifier> list){
		BlendModifiers nuevo= createBlend(list);
		for (BlendModifiers b: this.blends){
			if (b.compara(nuevo)==true){
				return true;
			}
		}
		return false;
		
	}
	private BlendModifiers createBlend(List<Modifier> list){
		String acceso="";
		boolean static_=false; 
		boolean final_=false; 
		boolean abstract_=false; 
		boolean synchronized_=false;
		
		for (Modifier m:list){
			if (m.isPublic()){
				acceso="public";
			}else if (m.isPrivate()){
				acceso="private";
			}else if (m.isProtected()){
				acceso="protected";
			}else if(m.isStatic()){
				static_=true;
			}else if(m.isFinal()){
				final_=true;
			}else if(m.isAbstract()){
				abstract_=true;
			}else if(m.isSynchronized()){
				synchronized_=true;
			}
		}
		return new BlendModifiers(acceso, static_, final_, abstract_, synchronized_);
	}
}
