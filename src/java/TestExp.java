public class TestExp{
	public int inc(){
		try{
			int x=1;
			return x;
		}catch(Exception e){
			int x=2;
			return x;
		}finally{
			int x=3;
		}

	}

	public static void main(String[] args){
		TestExp te=new TestExp();
		System.out.println(te.inc());
	}
}