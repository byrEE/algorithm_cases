public class ChooseSort{
	public void chooseSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int lowIndex=i;
			for(int j=i;j<arr.length;j++){
				if(arr[j]<arr[lowIndex])
					lowIndex=j;
			}
			int tmp=arr[i];
			arr[i]=arr[lowIndex];
			arr[lowIndex]=tmp;
		}
	}
	public static void main(String[] args){
		int[] arr={2,9,6,3,5,8,5,2,1,4,6,3,6,9,5,22,55,6,4,5,6,26,29,6,2,9,95,58,45,47,46,25,26,36,62};
		ChooseSort qs=new ChooseSort();
		qs.chooseSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}