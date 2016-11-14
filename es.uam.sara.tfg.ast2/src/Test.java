import java.util.ArrayList;
import java.util.List;

public class Test<T, K> extends ArrayList<T>{
	private List<K> i;
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
	Test() {
		//numCasa=new Casa().get();
	}
	
	public  int getNumCasa(List<List<T>> i) {
		return 1;
	}

	public String toString(){
		return "";
	}

	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
