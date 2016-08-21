import java.lang.Double;

public class Power{
	public double power(double base,int exponent){
		if(equal(base,0)){
			if(exponent>0)
				return 0;
			else
				return Double.NEGATIVE_INFINITY;
		}

		boolean pn=(exponent<0?true:false);

		exponent=(exponent>0?exponent:(-exponent));

		if(exponent==0)
			return 1;

		if(exponent==1)
			return base;

		double result=power(base,exponent>>1);
		result*=result;
		if((exponent & 0x1)==1)
			result*=base;
		
		return pn?(1/result):result;
	}

	public boolean equal(double a,double b){
		if((a-b)<0.00000001 && (a-b)>-0.00000001)
			return true;
		else
			return false;
	}

	public static void main(String[] args){
		Power pp=new Power();
		System.out.println(pp.power(2,-3));
	}
}