public class MergeSort{
	public void mergeSort(int[] arr,int start,int end){
		if(start<end){
			int mid=(start+end)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);

			merge(arr,start,mid,end);
		}
	}

	private void merge(int[] arr,int start,int mid,int end){
		int left=start;
		int right=mid+1;
		int m=0;
		int[] tmp_arr=new int[end-start+1];
		/*
		for(int i=0;left<=mid && right<=end;i++){
			if(arr[left]<arr[right])
				tmp_arr[i++]=arr[left++];
			else
				tmp_arr[i++]=arr[right++];
		}
		*/
	
		while(left<=mid && right<=end){
			if(arr[left]<arr[right])
				tmp_arr[m++]=arr[left++];
			else
				tmp_arr[m++]=arr[right++];
		}

		while(left<=mid){
			tmp_arr[m++]=arr[left++];
		}

		while(right<=end){
			tmp_arr[m++]=arr[right++];
		}

		for(int k=0;k<tmp_arr.length;k++){
			arr[start+k]=tmp_arr[k];
		}

	}

	public static void main(String[] args){
		int[] arr={2,9,6,3,5,8,5,2,1,4,6,3,6,9,5,22,55,6,4,5,6,26,29,6,2,9,95,58,45,47,46,25,26,36,62};
		MergeSort qs=new MergeSort();
		qs.mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}	
}