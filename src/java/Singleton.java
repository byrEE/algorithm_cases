public class Singleton{
	private Singleton(){}
	private static final Singleton INSTANCE=new Singleton();
	public Singleton getInstance(){
		return INSTANCE;
	}


	private static class InerSin{
		public static final Singleton instance=new Singleton();
	}

	
}