public class MidSort{
	public int midSort(int[] arr,int m,int low,int high){
		int mid=(low+high)/2;
		//boolean found=false;
		if(low+1<high){
			if(m<arr[mid]){
				return midSort(arr,m,low,mid);
			}
			else if(m>arr[mid]){
				return midSort(arr,m,mid,high);
			}
			else{
				return mid;
			}
		}
		else
			return -1;
		
	}

	public static void main(String[] args){
		int[] a={1,2,3,4,5,9,10,12,15,16,17,19,21,25,26,29,30,32,35,39,40};
		MidSort ms=new MidSort();
		System.out.println(ms.midSort(a,21,0,a.length));
	}
}