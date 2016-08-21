
public class LCPTry {

	public String longestCommonPrefix(String[] strs) {
        String s="";
        int j=0;
        boolean flag=true;        
        if(strs.length<1)
        	return "";
        else{
        	try{
        	while(j<strs[0].length()){
        		for(int k=1;k<strs.length;k++){
        			if(strs[0].charAt(j)!=strs[k].charAt(j)){
        				flag=false;
        				break;
        			}
        		}
        		if(flag){
        			s+=strs[0].charAt(j);
        			//System.out.println("s: "+s);
        		}
        		else
        			break;
        		j++;
        	}
        }catch(Exception e){}
        }
        return s;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCPTry ll=new LCPTry();
		String[] s={"aaa","aab","aa","aaaaaa"};
		//String[] s={};
		System.out.println(ll.longestCommonPrefix(s));

	}

}
