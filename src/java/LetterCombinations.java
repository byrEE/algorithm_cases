import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
	public List<String> letterCombinations(String digits) {
		int len=digits.length();
		List<String> lc=new ArrayList<String>();
		if(len==0)
			return lc;
		else{
		String[][] map={{""},{""},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        char[] shuzu=digits.toCharArray();
        int[] di=new int[len];
        for(int i=0;i<len;i++){
        	di[i]=shuzu[i]-48;
        }
        //System.out.println(di[0]);
        int l=0;
        String[] b=map[di[0]];
        while(l<len-1){
        	String[] a=new String[b.length*map[di[l+1]].length];
        	//for(String abs:a)
        		//abs="";
        	int k=0;
        	for(int i=0;i<b.length;i++){
        		for(int j=0;j<map[di[l+1]].length;j++){
        			a[k++]=b[i]+map[di[l+1]][j];
        		}
        	}
        	b=a;        	
        	l++;
        }
        for(String bb:b)
        	lc.add(bb);
        return lc;}
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc="569";
		LetterCombinations aa=new LetterCombinations();
		System.out.println(aa.letterCombinations(abc));

	}

}
