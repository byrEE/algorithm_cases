
public class RomantoInt {

	public int romanToInt(String s) {
        char a[]=s.toCharArray();
        int ans=0;
        for(int i=0;i<s.length();i++){
        	switch(a[i]){
        	case 'I':
        		if((i+1)<s.length()&&a[i+1]=='V'){
        			ans+=4;
        			//System.out.println(ans);
        			i++;}
        		else if((i+1)<s.length()&&a[i+1]=='X'){
        			ans+=9;
        			//System.out.println(ans);
        			i++;}
        		else
        			ans+=1;
        			//System.out.println(ans);
        		break;
        	case 'V':
        		ans+=5;
        		break;
        	case 'X':
        		if((i+1)<s.length()&&a[i+1]=='L'){
        			ans+=40;
        			i++;}
        		else if((i+1)<s.length()&&a[i+1]=='C'){
        			ans+=90;
        			i++;}
        		else
        			ans+=10;
        		break;
        	case 'L':
        		ans+=50;
        		break;
        	case 'C':
        		if((i+1)<s.length()&&a[i+1]=='D'){
        			ans+=400;
        			i++;}
        		else if((i+1)<s.length()&&a[i+1]=='M'){
        			ans+=900;
        			i++;}
        		else
        			ans+=100;
        		break;
        	case 'D':
        		ans+=500;
        		break;
        	case 'M':
        		ans+=1000;
        		break;
        	}
        	//System.out.println(ans);
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomantoInt a=new RomantoInt();
		System.out.println(a.romanToInt("MMMCMXCIX"));

	}

}
