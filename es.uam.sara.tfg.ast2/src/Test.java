
public class Test{
	
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

	public  class Casa implements hola{
		private int num=0;
		public Casa() {
		}
		public int get() {
			num++;
			return num;
		}
	}
	private int numCasa;
	private nada eso=nada.cafe;
	Test() {
		//numCasa=new Casa().get();
	}
	
	public  int getNumCasa() {
		return numCasa;
	}

	
}
