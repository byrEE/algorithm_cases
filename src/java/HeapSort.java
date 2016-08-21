public class HeapSort{
	public void heapAdjust(int[] arr,int i,int size){
		int left=2*i+1;
		int right=2*i+2;
		int largest=i;
		//int tmp;
		if(left<size && arr[i]<arr[left])
			largest=left;
		if(right<size && arr[right]>arr[largest])
			largest=right;

		if(largest!=i){
			System.out.println("before swap: "+arr[i]+" "+arr[largest]);
			swap(arr[i],arr[largest]);
			System.out.println("after swap: "+arr[i]+" "+arr[largest]);

			/*
			tmp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=tmp;
			*/
			heapAdjust(arr,largest,size);
		}
		//System.out.println("heap Adjust "+arr[i]);


	}

	public static void swap(int i,int j){
		int tmp;
		tmp=i;
		i=j;
		j=tmp;
	}

	
	public void buildHeap(int[] arr,int size){
		for(int i=size/2-1;i>=0;i--)
			heapAdjust(arr,i,size);
		//System.out.println("build heap");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public void heapSort(int[] arr){
		int size=arr.length;
		buildHeap(arr,size);
		//int tmp;
		for(int i=size-1;i>=0;i--){
			swap(arr[0],arr[i]);
			/*
			tmp=arr[0];
			arr[0]=arr[i];
			arr[i]=tmp;
			*/
			heapAdjust(arr,0,i);
		}
	}

	public static void main(String[] args){
		int[] arr={2,9,6,3,5,8,5,2,1,4,6,3,6,9,5,22,55,6,4,5,6,26,29,6,2,9,95,58,45,47,46,25,26,36,62};
		HeapSort hs=new HeapSort();
		//int len=arr.length;
		hs.heapSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}