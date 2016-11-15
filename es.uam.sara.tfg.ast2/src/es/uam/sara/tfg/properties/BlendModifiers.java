package es.uam.sara.tfg.properties;

public class BlendModifiers {
	private Acceso acceso;
	private boolean static_;
	private boolean final_;
	private boolean abstract_;
	private boolean default_;
	private boolean synchronized_;
	public enum Acceso{
		NOTHING, PUBLIC, PRIVATE, PROTECTED
	}
	
	public BlendModifiers( Acceso acceso, boolean static_, boolean final_, boolean abstract_, boolean default_, boolean synchronized_){
		this.acceso=acceso;
		this.static_=static_;
		this.final_=final_;
		this.abstract_=abstract_;
		this.default_=default_;
		this.synchronized_=synchronized_;
	}

	public Acceso getAcceso() {
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
		if ((this.acceso!=Acceso.NOTHING) && this.acceso!=b2.acceso){
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
		if (this.default_==true && b2.default_!=true){
			return false;
		}
		if (this.synchronized_==true && b2.synchronized_!=true){
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		String and="";
		String cad="";
		if(this.acceso!=Acceso.NOTHING){
			cad+=this.acceso;
			and=" and ";
		}
		if (static_){
			cad+=and+"static";
			and=" and ";
		}
		if (final_){
			cad+=and+"final";
			and=" and ";
		}
		if (abstract_){
			cad+=and+"abstract";
			and=" and ";
		}
		if (default_){
			cad+=and+"default";
			and=" and ";
		}
		if (synchronized_){
			cad+=and+"synchronized";
		}
		return cad;
	}

	public boolean isDefault_() {
		return default_;
	}

	public void setDefault_(boolean default_) {
		this.default_ = default_;
	}
}
 