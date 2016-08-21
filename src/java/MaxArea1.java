import java.util.Random;

public class MaxArea1 {

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
    	/*
    	Random random=new Random();
    	int k=15000;
    	long t1=System.currentTimeMillis();
    	while(k>0){
    	int length=(random.nextInt(1000)+1)%1000;
    	int a[]=new int[length];
    	while(length>0){
    		a[length-1]=(random.nextInt(1000)+1)%1000;
    		length--;
    	}
    	//int a[]={1,2,3,4,5,6,7,8,9};
    	MaxArea1 b=new MaxArea1();
    	System.out.println(b.maxArea(a)+"  ");
    	k--;
    	}
    	double ts=(System.currentTimeMillis()-t1)/1000.0;
    	System.out.println(ts+"s");
    	*/
    	int k=10000;
    	int[] a=new int[k];
    	for(int i=0;i<k;i++){
    		a[i]=k--;
    	}
    	long t1=System.currentTimeMillis();
    	MaxArea1 b=new MaxArea1();
    	System.out.println(b.maxArea(a));
    	double ts=(System.currentTimeMillis()-t1)/1000.0;
    	System.out.println("algrithom1: "+ts+"s");
    	
    }

}
