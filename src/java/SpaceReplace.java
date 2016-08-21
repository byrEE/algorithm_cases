public class SpaceReplace{
	public String spaceReplace(String s){
		char[] sc=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(sc[i]==' ')
				sb.append("%20");
			else
				sb.append(sc[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args){
		SpaceReplace sr=new SpaceReplace();
		String s=" We are happy.";
		System.out.println(sr.spaceReplace(s));
	}
}