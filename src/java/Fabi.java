public class Fabi{
	public long fabi(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else{
			long cacheValue1=1;
			long cacheValue2=0;
			long fabn=0;
			for(int i=2;i<n;i++){
				fabn=cacheValue1+cacheValue2;
				cacheValue2=cacheValue1;
				cacheValue1=fabn;
			}
			return fabn;
		}
	}

	public static void main(String[] args){
		Fabi fa=new Fabi();
		System.out.println(fa.fabi(8));
	}
}