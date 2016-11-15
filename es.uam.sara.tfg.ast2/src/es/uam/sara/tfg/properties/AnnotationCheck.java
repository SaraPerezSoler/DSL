package es.uam.sara.tfg.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.BodyDeclaration;

public class AnnotationCheck {

	private List<String> annotations;

	public AnnotationCheck() {
		annotations = new ArrayList<String>();
	}

	public void addAnnotation(String ann) {
		if (ann.startsWith("@")) {
			annotations.add(ann);
		}else{
			annotations.add("@"+ann);
		}
	}
	
	public static List<String> getListAnnotations(BodyDeclaration bd) {
		List<String> mList = new ArrayList<String>();
		for (Object o : bd.modifiers()) {
			if (o instanceof Annotation) {
				mList.add(((Annotation) o).toString());
			}
		}
		return mList;
	}
	
	public boolean check(BodyDeclaration bd) {
		List<String> bdAnnotations= getListAnnotations(bd);
		for (String a: annotations){
			if (!(bdAnnotations.contains(a))){
				return false;
			}
		}
		return true;
	}
}
