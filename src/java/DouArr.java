public class DouArr{
	public boolean searchNum(int[][] arr,int rows,int columns,int num){
		
		int row=0;
		boolean found=false;
		while(columns-1>=0 && row<=rows-1){
			if(arr[row][columns-1]>num)
				columns--;
			else if(arr[row][columns-1]<num){
				row++;
			}
			else{
				found=true;
				break;
			}
		}
		return found;	
	}

	public static void main(String[] args){
		int[][] arr={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		DouArr da=new DouArr();
		System.out.println(da.searchNum(arr,4,4,5));
	}
}