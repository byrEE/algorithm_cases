public class NumOfOne{
	public int numOfOne(int num){
		int count=0;
		while(num!=0){
			count++;
			if((num-1)!=0)
				num=num & (num-1);
		}
		return count;
	}

	public static void main(String[] args){
		NumOfOne noo=new NumOfOne();
		System.out.println(noo.numOfOne(9));
		System.out.println(noo.numOfOne(0));
		System.out.println(noo.numOfOne(-9));
		System.out.println(noo.numOfOne(0x7fffffff));
	}
}