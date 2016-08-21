public class MaopaoSort{
	public int[] sort(int[] a){
		int len=a.length;
		int tmp;
		boolean flag=true;
		while(flag){
			flag=false;
			for(int i=len;i>0;i--){
				for(int j=0;j<i-1;j++){
					if(a[j]>a[j+1]){
						tmp=a[j];
						a[j]=a[j+1];
						a[j+1]=tmp;
						flag=true;
					}
				}
			}
		}
		return a;
	}

	public static void main(String[] args){
		int[] arr={2,9,6,3,5,8,5,2,1,4,6,3,6,9,5,22,55,6,4,5,6,26,29,6,2,9,95,58,45,47,46,25,26,36,62};
		MaopaoSort ms=new MaopaoSort();
		int[] b=ms.sort(arr);
		System.out.println(arr.length+" "+b.length);
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}
} 