public class Permutation{
	public void permutation(String s){
		if(s.length()<1)
			return;

		char[] sc=s.toCharArray();
		permutationChar(sc,0,s.length()-1);

	}

	public void permutationChar(char[] sc,int from,int to){
		if(from>to)
			return;
		if(from==to)
			System.out.println(sc);
		else{
			for(int i=from;i<=to;i++){
				swap(sc,from,i);
				permutationChar(sc,from+1,to);
				swap(sc,from,i);
			}
		}
	}

	public void swap(char[] ch,int a,int b){
		char tmp=ch[a];
		ch[a]=ch[b];
		ch[b]=tmp;

	}

	public static void main(String[] args) {
		Permutation per=new Permutation();
		String s="ac";
		per.permutation(s);
	}
}