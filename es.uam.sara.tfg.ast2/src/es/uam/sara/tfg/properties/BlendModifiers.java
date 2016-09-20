package es.uam.sara.tfg.properties;

public class BlendModifiers {
	private String acceso;
	private boolean static_;
	private boolean final_;
	private boolean abstract_;
	private boolean synchronized_;
	
	public BlendModifiers( String acceso, boolean static_, boolean final_, boolean abstract_, boolean synchronized_){
		this.acceso=acceso;
		this.static_=static_;
		this.final_=final_;
		this.abstract_=abstract_;
		this.synchronized_=synchronized_;
	}

	public String getAcceso() {
		return acceso;
	}

	public boolean isStatic_() {
		return static_;
	}

	public boolean isFinal_() {
		return final_;
	}

	public boolean isAbstract_() {
		return abstract_;
	}

	public boolean isSynchronized_() {
		return synchronized_;
	}
	/**
	 * El metodo es llamado desde el conjunto que debe estar, aunque si hay mas sigue siendo valido.
	 * Es decir tiene que estar public, pero si hay public y static sigue devolviendo true.
	 * */
	public boolean compara(BlendModifiers b2){
		if ((this.acceso!="") && this.acceso.compareTo(b2.acceso)!=0){
			return false;
		}
		if ((this.abstract_==true) && b2.abstract_!=true){
			return false;
		}
		if (this.static_==true && b2.static_!=true){
			return false;
		}
		if (this.final_==true && b2.final_!=true){
			return false;
		}
		if (this.synchronized_==true && b2.synchronized_!=true){
			return false;
		}
		return true;
	}
}
 