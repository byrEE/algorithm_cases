import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> LLI=new ArrayList<List<Integer>>();
		for(int i=0;i<nums.length-3;i++){
			for(int j=i+1;j<nums.length-2;j++){
				for(int k=j+1;k<nums.length;k++){
					if(nums[i]+nums[j]+nums[k]==0){
						int tmp1=nums[i]<nums[j]?nums[i]:nums[j];
						int tmp2=nums[i]+nums[j]-tmp1;
						int min=tmp1<nums[k]?tmp1:nums[k];
						int tmp3=tmp1+nums[k]-min;
						int max=tmp2>tmp3?tmp2:tmp3;
						List<Integer> LI=new ArrayList<Integer>();
						LI.add(min);
						LI.add(0-min-max);
						LI.add(max);
						if(!LLI.contains(LI)){
							LLI.add(LI);
						}
						break;
					}
				}
			}
		}
        return LLI;
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSum ts=new ThreeSum();
		long ti=System.currentTimeMillis();
		int[] a={-9,-14,-3,2,0,-11,-5,11,5,-5,4,-4,5,-15,14,-8,-11,10,-6,1,-14,-12,-13,-11,9,-7,-2,-13,2,2,-15,1,3,-3,-12,-12,1,-2,6,14,0,-4,-13,-10,-12,8,-2,-8,3,-1,8,4,-6,2,1,10,2,14,4,12,1,4,-2,11,9,-7,6,-13,7,-3,8,14,8,10,12,11,-4,-13,10,14,1,-4,-4,2,5,4,-11,-7,3,8,-10,11,-11,-5,7,13,3,-2,8,-13,2,1,9,-12,-11,6};
		int[] b={-1,0,1,2,-1,-4};
		int[] c={12,13,-10,-15,4,5,-8,11,10,3,-11,4,-10,4,-7,9,1,8,-5,-1,-9,-4,3,-14,-11,14,0,-8,-6,-2,14,-9,-4,11,-8,-14,-7,-9,4,10,9,9,-1,7,-10,7,1,6,-8,12,12,-10,-7,0,-9,-3,-1,-1,-4,8,12,-13,6,-7,13,5,-14,13,12,6,8,-2,-8,-15,-10,-3,-1,7,10,7,-4,7,4,-4,14,3,0,-10,-13,11,5,6,13,-4,6,3,-13,8,1,6,-9,-14,-11,-10,8,-5,-6,-7,9,-11,7,12,3,-4,-7,-6,14,8,-1,8,-4,-11};
		int[] d={0,-6,0,-14,2,0,-9,5,-9,-8,-7,12,-4,14,-6,6,0,5,-2,6,-7,1,10,-10,-5,3,-2,-3,-13,-6,1,-6,3,9,-5,12,-6,-7,2,0,1,11,-11,4,2,-2,-5,-13,11,0,9,11,-13,-4,-13,-11,14,-8,1,8,1,9,-13,-11,3,-11,9,12,-2,-4,-11,6,14,-7,-5,1,-1,-3,-4,-5,12,12,13,6,-7,-15,10,14,14,-12,8,0,13,2,-3,1,-1,-9,-9,12,-6,-5,-5,-6,4,5,2,10,-13,13,12,6};
		System.out.println(ts.threeSum(d));
		//ts.threeSum(a);
		System.out.println(System.currentTimeMillis()-ti);
		System.out.println("n1");

	}

}
