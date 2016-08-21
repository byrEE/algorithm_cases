import java.util.Stack;
import java.lang.Integer;

public class IsPopOrder{
	public boolean isPopOrder(int[] inStack,int[] popOrder){
		if(popOrder.length==0)
			return true;
		if(inStack.length<popOrder.length)
			return false;

		//boolean result=false;

		Stack<Integer> stack=new Stack<Integer>();
		int indexIn=0;
		int indexPop=0;
		
		while(indexPop<popOrder.length){
			if(stack.empty())
				stack.push(inStack[indexIn++]);

			try{

			if(stack.peek()!=popOrder[indexPop])
				stack.push(inStack[indexIn++]);
			else{
				//stack.push(inStack[indexIn++]);
				stack.pop();
				indexPop++;
				System.out.println(indexPop);
			}
		}catch(Exception e){
			break;
		}
		}
		
		return indexPop==popOrder.length?true:false;

	}

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		int[] b={4,5,3,2,1};
		int[] c={4,3,5,1,2};

		IsPopOrder ip=new IsPopOrder();
		System.out.println(ip.isPopOrder(a,b));
		System.out.println(ip.isPopOrder(a,c));
	}
}