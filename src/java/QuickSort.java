public class QuickSort{
	public void quickSort(int[] arr,int low,int high){
		if(low<high){
			int mid=partition(arr,low,high);
			quickSort(arr,low,mid-1);
			quickSort(arr,mid+1,high);
		}
	}

	private int partition(int[] arr,int low,int high){
		int pivot = arr[low];  
		while(low<high){
			while(low<high && arr[high]>=pivot)
				high--;
			arr[low]=arr[high];

			while(low<high && arr[low]<=pivot)
				low++;
			arr[high]=arr[low];
		}

		arr[low]=pivot;
		return low;

	}

	private int interInt(int a,int b,int c){
		if(a>b)
			return c>a?a:(c>b?c:b);
		else
			return c>b?b:(c>a?c:a);
	}

	public static void main(String[] args){
		int[] arr={3,6,7,2,5,9,10,1,4};
		QuickSort qs=new QuickSort();
		qs.quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
}