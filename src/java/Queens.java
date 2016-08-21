public class Queens{
	public static int methodNum=0;
	public static final int queenNum=8;
	public static int[] columnIndex=new int[queenNum];

	
	public Queens(){
		for(int i=0;i<queenNum;i++)
		columnIndex[i]=i;
		permutation(columnIndex,0,queenNum-1);;
		System.out.println(methodNum);
	}


	public void permutation(int[] arr,int from,int to){
		if(from>to)
			return;

		if(from==to){
			if(check(arr)){
				methodNum++;
			}
		}

		else{
			for(int i=from;i<=to;i++){
				swap(arr,from,i);
				permutation(arr,from+1,to);
				swap(arr,i,from);
				
			}
		}
	}

	public void swap(int[] arr,int from,int to){
		int tmp=arr[from];
		arr[from]=arr[to];
		arr[to]=tmp;
	}

	public boolean check(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]-arr[j]==(i-j) || arr[i]-arr[j]==(j-i))
					return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		Queens qu=new Queens();
	}
}