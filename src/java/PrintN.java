public class PrintN{

	public static char[] numOfChar={'0','1','2','3','4','5','6','7','8','9'};

	public void printN(int n){
		if(n<=0)
			return;
		char[] numbers=new char[n];
		for(int i=0;i<10;i++){
			numbers[0]=numOfChar[i];
			generateN(numbers,n,0);
		}
	}

	public void generateN(char[] numbers,int length,int index){
		if(index==(length-1)){
			String str=new String(numbers);
			printNum(str);
			return;
		}
		for(int i=0;i<10;i++){
			numbers[index+1]=numOfChar[i];
			generateN(numbers,length,index+1);
		}

	}

	public void printNum(String s){
		char[] charArr=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		int start=0;
		int count=0;
		for(int i=0;i<s.length();i++){
			if(charArr[i] != '0'){
				start=i;
				count++;
				break;
			}
		}
		if(count>0){
			for(int i=start;i<s.length();i++)
				sb.append(charArr[i]);
			System.out.println(sb);
		}
	}

	public static void main(String[] args){
		PrintN pn=new PrintN();
		pn.printN(1);
	}
}