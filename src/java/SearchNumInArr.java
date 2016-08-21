public class SearchNumInArr{
	public boolean searchNum(int[][] arr,int num){
		int rows=arr.length;
		int cols=arr[0].length-1;
		
		boolean found=false;

		if(rows>0 && cols>0){
			int row=0;
			while(row<rows && cols>0){
				if(num>arr[row][cols]){
					row++;
				}
				else if(num<arr[row][cols]){
					cols--;
				}
				else{
					found=true;
					break;
				}
			}
		}
		return found;
	}


	public static void main(String[] args){
		int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		SearchNumInArr sn=new SearchNumInArr();
		System.out.println(sn.searchNum(a,15));
	}
}