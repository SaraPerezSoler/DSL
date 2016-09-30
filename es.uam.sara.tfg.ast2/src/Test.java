
public enum Test{
	hola;
	enum nime{
		
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
	
	Test() {
		//numCasa=new Casa().get();
	}
	
	public  int getNumCasa() {
		return numCasa;
	}

	
}
