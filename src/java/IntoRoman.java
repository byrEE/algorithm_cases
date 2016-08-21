
public class IntoRoman {

	public String intToRoman(int num) {
        String[] RomanTable={"I","V","X","L","C","D","M"};
        int n=0,k=0;
        String apd[]={"","","",""};
        while(num>0){
        	int a=num%10;
        	System.out.println(a);
        	if(a<4)
        		apd[k]=ins(apd[k],a,RomanTable[n]);
        	else if(a==4)
        		apd[k]=RomanTable[n]+RomanTable[n+1];
        	else if(a<9){
        		apd[k]=ins(apd[k],a-5,RomanTable[n]);
        		apd[k]=RomanTable[n+1]+apd[k];
        	}
        	else
        		apd[k]=RomanTable[n]+RomanTable[n+2];
        	System.out.println(k+" : "+apd[k]);
        	num/=10;
        	System.out.println(num);
        	n+=2;
        	k+=1;
        }        
    return apd[3]+apd[2]+apd[1]+apd[0];
	}
	public String ins(String s,int n,String m){
		while(n>0){
			s+=m;
			n--;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntoRoman a=new IntoRoman();
		System.out.println(a.intToRoman(7));
	}

}
