
public class RemoveDuplicatesOrder {
	public int RemoveDuplicates(int[] nums) {
        if(nums.length<2)
        	return nums.length;
        int k=-1;
        for(int i=1;i<nums.length;i++){
        	if(nums[i]==nums[i-1]){
        		k=i;
        		//System.out.println(k);
        		break;
        	}
        }
        if(k>0){
        for(int j=k;j<nums.length;j++){
        	if(j!=k && nums[j]==nums[j-1])
        		continue;
        	if(nums[j]!=nums[k])
        		nums[k++]=nums[j];
        
        }
        }
        else
        	k=nums.length;
        return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] shuzu={1,2,3,4,6,6,7,8,8,8,9,9,10,10,11,11};
		//int[] shuzu={1,2,3,4,6,6,7,7,7,8,8,8,9,9,10,10,11,11,11,11,11,11,12,13};
		//int[] shuzu={1,1,1,1,1,1,1,2,3,4,5,5,5,6,6,7,7,7,7,7,7,7,7,7,7,7,7};
		//int[] shuzu={1,2};
		RemoveDuplicatesOrder rd=new RemoveDuplicatesOrder();
		System.out.println("new nums length: "+rd.RemoveDuplicates(shuzu));
		for(int num:shuzu){
			System.out.print(num+" ");
		}
	}

}
