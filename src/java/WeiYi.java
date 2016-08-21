public class WeiYi{
	public int weiYi(int n){
		int count=0;
		while(n!=0){
			n=(n&(n-1));
			if(n!=0)
				count++;
		}
		return count+1;
	}

	public static void main(String[] args){
		WeiYi kk=new WeiYi();
		System.out.println(kk.weiYi(5));
	}
}