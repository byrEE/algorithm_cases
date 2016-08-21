
public class LCP {

	public String longestCommonPrefix(String[] strs) {
        String s="";
        //char a;
        int j=0;
        boolean flag=true;
        
        if(strs.length<1)
        	return "";
        else{
        
        	int min_len=strs[0].length();
        	for(int i=1;i<strs.length;i++)
        		min_len=min_len<strs[i].length()?min_len:strs[i].length();
        	while(j<min_len){
        		for(int k=1;k<strs.length;k++){
        			if(strs[0].charAt(j)!=strs[k].charAt(j)){
        				flag=false;
        				break;
        			}
        		}
        		if(flag){
        			s+=strs[0].charAt(j);
        			//System.out.println(s);
        		}
        		else
        			break;
        		j++;
        	}
        }
        return s;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCP ll=new LCP();
		//String[] s={"aaa","aab","aa","aaaaaa"};
		String[] s={};
		System.out.println(ll.longestCommonPrefix(s));

	}

}
