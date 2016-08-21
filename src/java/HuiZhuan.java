public class HuiZhuan{
	public int huiZhuan(int[] arr){
		if(arr.length==0)
			throw new NullPointerException();
		else
			return numMid(arr,0,arr.length-1);
	}

	public int numMid(int arr[],int start,int end){
		int mid=(start+end)/2;
		//int a;
		//int b;
		if(start<end){
			if(arr[mid]>arr[end]){
				System.out.println("start: "+start+" end: "+end+" mid: "+mid+" 111");
				numMid(arr,mid+1,end);
				return arr[mid]<arr[mid+1]?arr[mid]:arr[mid+1];
			}
			else if(arr[mid]<arr[end]){
				System.out.println("start: "+start+" end: "+end+" mid: "+mid+" 222");
				numMid(arr,start,mid);
				return arr[mid]<arr[mid+1]?arr[mid]:arr[mid+1];
			}
			else{
				System.out.println("start: "+start+" end: "+end+" mid: "+mid+" 333");
				//return minNum(numMid(arr,start,mid),numMid(arr,mid+1,end));				
				return numMid(arr,start,mid)<numMid(arr,mid+1,end)?numMid(arr,start,mid):numMid(arr,mid+1,end);
			}
		}

		else{
			//mid=(start+end)/2;
			//System.out.println("start: "+start+" end: "+end+" mid: "+mid+" 444");
			//System.out.println("start: "+start+" end: "+end+" mid: "+mid);
			//if(start==end && start+1<arr.length)
			//	return minNum(arr[start+1],arr[start]);
			//else
			//return minNum(arr[start],arr[end]);
			if(mid<arr.length-1){
				//mid=mid*2/2;
				System.out.println("arr[mid+1]: "+arr[mid+1]);
				return 10;//arr[mid+1];
				
				//System.out.println("mid or mid+1 selected.");
				/*
				System.out.println("arr[mid]: "+arr[mid]+" "+"arr[mid+1]: "+arr[mid+1]);
				//return arr[mid]<arr[mid+1]?arr[mid]:arr[mid+1];
				if(arr[mid]<arr[mid+1]){
					//System.out.println("arr[mid]: "+arr[mid]);
					a=arr[mid];
					System.out.println("a: "+a);
					return a;
				}
				else{
					//System.out.println("arr[mid+1]: "+arr[mid+1]);
					b=arr[mid+1];
					System.out.println("b: "+b);
					return b;
				}
				*/
				
			
			}
			else{
				//System.out.println("mid selected.");
				//mid=mid*2/2;
				return arr[mid];
			}

		}
		
		//return minNum(arr[mid],arr[mid+1]);
	}

	public int minNum(int a,int b){
		return a<b?a:b;
	}

	public static void main(String[] args){
		int[] a={3,3,3,3,0,3};
		int[] b={3,0,3,3,3,3};
		int[] c={3,4,5,1,2,3}; 
		int[] d={3,4,5,1,2,2}; 
		int[] e={3,4,5,6,1,2}; 
		int[] f={3,4,4,5,2,3};
		HuiZhuan hz=new HuiZhuan();
		System.out.println("result is: "+hz.huiZhuan(a)); 
		System.out.println("result is: "+hz.huiZhuan(b)); 
		System.out.println("result is: "+hz.huiZhuan(c)); 
		System.out.println("result is: "+hz.huiZhuan(d)); 
		System.out.println("result is: "+hz.huiZhuan(e)); 
		System.out.println("result is: "+hz.huiZhuan(f)); 
	}
}