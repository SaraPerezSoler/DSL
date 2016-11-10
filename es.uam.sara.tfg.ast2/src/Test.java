import java.util.List;

public class Test<T, K>{
	
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

	
}
