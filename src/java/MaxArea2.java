
public class MaxArea2 {

	public int maxArea(int[] height) {
        int max_area=0,tmp=0;
        int check_max=0;
        for(int i=0;i<height.length;i++){
        	if(height[check_max]<=height[i]){
        		check_max=i;
        		for(int j=height.length-1;j>i;j--){
        			tmp=(j-i)*(height[j]>height[i]?height[i]:height[j]);
        			max_area=max_area>tmp?max_area:tmp;
        			if(height[i]<=height[j])
        				break;
        		}
        	}
        }           
        return max_area;
    }
    public static void main(String[] args){
    	
    	int a[]={1,1};
    	MaxArea1 b=new MaxArea1();
    	System.out.println(b.maxArea(a));
    	
    	/*
    	int k=10000;
    	int[] a=new int[k];
    	for(int i=0;i<k;i++){
    		a[i]=k--;
    	}
    	long t1=System.currentTimeMillis();
    	MaxArea1 b=new MaxArea1();
    	System.out.println(b.maxArea(a));
    	double ts=(System.currentTimeMillis()-t1)/1000.0;
    	System.out.println("algrithom2: "+ts+"s");
    	*/
    }

}
