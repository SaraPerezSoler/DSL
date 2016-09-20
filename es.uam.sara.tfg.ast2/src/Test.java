import java.util.ArrayList;
import es.uam.sara.tfg.properties.packages.NoEmpty;

public class Test {

	public static void main(String[] args) {
		NoEmpty bla=new NoEmpty(new ArrayList<String>());
		bla.check();
	}

}
