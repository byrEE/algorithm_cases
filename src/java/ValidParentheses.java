
public class ValidParentheses {
	public boolean isValid(String s) {
        if(s.length()%2==1)
        	return false;
        	
		char[] sc=s.toCharArray();
        
        if(sc[0]==')' || sc[0]=='}' || sc[0]==']')
        	return false;
        
        char[] ad=new char[s.length()];
        boolean flag=true;
        ad[0]=sc[0];
        int i=1,k=0;
        while(i<s.length()){
        	if(sc[i]=='(' || sc[i]=='{' || sc[i]=='['){
        		ad[++k]=sc[i++];        		
        		//System.out.println("if: "+flag);
        	}
        	else if(sc[i]+ad[k]==248 || sc[i]+ad[k]==81 || sc[i]+ad[k]==184){
        		if(k!=0){
        			k--;
        			i++;
        			}
        		else{
        			ad[0]=' ';
        			i++;
        		}
        		//System.out.println("else if: "+flag);
        	}
        	else{
    			flag=false;
    			//System.out.println("else: "+flag);
    			break;
        	}
        }
        if(ad[0]!=' ')
        	flag=false;
		return flag;
		}
	public static void main(String[] args){
		ValidParentheses vp=new ValidParentheses();
		String s="[[";
		//vp.isValid(s);
		System.out.println(vp.isValid(s));
	} 
}

