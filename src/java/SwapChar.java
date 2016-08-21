public class SwapChar{
	public void swapChar(String s){
		if(s.length()<1)
			return;
		char[] sc=s.toCharArray();
		int len=s.length()-1;
		swap(sc[0],sc[len]);
		System.out.println(sc);
	}

	public void swap(char from,char to){
		char tmp=from;
		from=to;
		to=tmp;

		//System.out.println(sc);
	}

	public static void main(String[] args) {
		SwapChar sc=new SwapChar();
		String s="abcds";
		sc.swapChar(s);
	}
}