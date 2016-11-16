import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Test<T, K> {
	public enum nada{
		cafe(0), chocolate(1);
		
		private int valor;
		private nada(int i){
			valor=i;
		}
		
		private enum th{
			
		}
	}
	interface hola{
		
	}

	public  interface Casa extends hola{
		int num=0;
		public int get();
	}

	/**
	 * 
	 * 
	 * */
	public  int getNumCasa(List<List<T>> i) {
		return 1;
	}

	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String toString() {
		return "Test []";
	}
}