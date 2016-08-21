
public class RemoveDuplicates {

	public int RemoveDuplicates(int[] nums) {
        if(nums.length<2)
        	return nums.length;
        int k=0,j=nums.length-1,m=0;
        for(int i=0;i<=j;i++){
        	if(i!=0 && nums[i]==nums[i-1]){
        		m++;
        		continue;
        	}
        	else
        		k++;
        	if(m>0){
        		while(m>0 && i<=j){
        			if(j!=nums.length-1 && nums[j]==nums[j+1]){
        				j--;
        				continue;
        				}
        			else{
        			nums[i-m]=nums[j];
        			k++;
        			m--;
        			j--;}
        		}
        		if(i>=j && nums[j]==nums[j+1])
        			k--;
        		if(m>0)
        			k-=m;
        	}
        }
        return k;
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] shuzu={1,2,3,4,6,6,7,8,8,8,9,9,10,10,11,11};
		int[] shuzu={1,2,3,4,6,6,7,7,7,8,8,8,9,9,10,10,11,11,11,11,11,11,12,13};
		//int[] shuzu={1,1,1,1,1,1,1,2,3,4,5,5,5,6,6,7,7,7,7,7,7,7,7,7,7,7,7};
		//int[] shuzu={1,1,2,3};
		RemoveDuplicates rd=new RemoveDuplicates();
		System.out.println("new nums length: "+rd.RemoveDuplicates(shuzu));
		for(int num:shuzu){
			System.out.print(num+" ");
		}
	}

}
