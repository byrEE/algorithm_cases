public class InsertSort{
	public void insertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int j=i-1;
			int tmp=arr[i];
			while(j>=0 && tmp<arr[j]){
				arr[j+1]=arr[j];
				j--;

			}
			arr[j+1]=tmp;
		}
	}
}