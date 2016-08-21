import java.util.List;
import java.util.ArrayList;

public class DiguiCombination{
	public void diguiCombination(String s){
		if(s.length()<1)
			return;

		int len=s.length();
		char[] sc=s.toCharArray();
		List<Character> list=new ArrayList<Character>();

		for(int i=1;i<=len;i++)
			combine(sc,0,i,list);
		
	}

	public void combine(char[] sc,int begin,int num,List<Character> list){
		if(num==0){
			System.out.println(list.toString());
			return;
		}

		if(begin==sc.length)
			return;

		list.add(sc[begin]);
		combine(sc,begin+1,num-1,list);
		list.remove((Character) sc[begin]);
		combine(sc,begin+1,num,list);
	}

	public static void main(String[] args) {
		String s="abc";
		DiguiCombination dc=new DiguiCombination();
		dc.diguiCombination(s);
	}
}