public class Combination{
	public void combination(String s){
		if(s.length()<1 || s.length()>31)
			return;

		int len=s.length();
		int num=1<<len;
		char[] sc=s.toCharArray();

		for(int i=1;i<num;i++){
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<len;j++){
				if(((i>>j) & 0x1)==1)
					sb.append(sc[j]);
			}
			System.out.println(sb);
		}
	}

	public static void main(String[] args) {
		Combination co=new Combination();
		co.combination("qw");
	}
}