public class MaxArea{
public int maxArea(int[] height) {
        int max_area=0;
        for(int i=0;i<height.length;i++){
        	for(int j=i+1;j<height.length;j++){
        		int tmp=(j-i)*(height[i]<height[j]?height[i]:height[j]);
        		max_area=max_area>tmp?max_area:tmp;
        		}
        	}
        return max_area;
    }
    public static void main(String[] args){
    	int a[]={1,2,3,4,5,6,7,8,9};
    	MaxArea b=new MaxArea();
    	System.out.println(b.maxArea(a));
    }
}