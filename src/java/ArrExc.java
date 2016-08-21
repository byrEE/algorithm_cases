public class ArrExc{
	public void swap(int i,int j){
		System.out.println(i+" "+j);
		int tmp;
		tmp=i;
		i=j;
		j=tmp;
		System.out.println(i+" "+j);
		return;
	}

	public static void main(String[] args){
		int[] a={1,2};
		ArrExc ae=new ArrExc();
		//ae.swap(a[0],a[1]);
		int m=9,k=10;
		ae.swap(m,k);
		System.out.println(m+" "+k);
		//for(int i=0;i<2;i++)
		//	System.out.println(a[i]);
	}
}