
public class MinReverse{
	public int min(int[] arr){
		int len=arr.length;
		if(len==0)
			throw new NullPointerException();
		
		if(arr[0]<arr[len-1])
			return arr[0];
		else{
			int index1=0;
			int index2=len-1;
			int mid=index1;

			while(arr[index1]>=arr[index2]){
				if(index2-index1==1){
					mid=index2;
					break;
				}

				mid=(index1+index2)/2;

				if(arr[mid]>arr[index2]){
					index1=mid;
					//mid=(mid+index2)/2;
				}
				else if(arr[mid]<arr[index2]){
					index2=mid;
					//mid=(mid+index1)/2;
				}
				else{
					if(arr[mid]==arr[index1]){
						mid=minor(arr,index1,index2);
						break;
					}
				}
			}
			return arr[mid];
		}
	}


	public int minor(int[] arr,int index1,int index2){
		//int index=0;
		for(int i=index1+1;i<index2;i++){
			if(arr[i]<arr[index1]){
				index1=i;
				break;
			}			
		}
		return index1;
	}

	public static void main(String[] args){
		MinReverse mr=new MinReverse();
		int[] a={3,3,3,3,3,3,0,3,3};
		int[] b={3,3,3,3,3,3,3,1,1,1,1,1,1,1,2};
		int[] c={4,5,6,7,8,9,1,2,3};
		System.out.println(mr.min(a));
		System.out.println(mr.min(b));
		System.out.println(mr.min(c));
	}
}