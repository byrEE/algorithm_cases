import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	//digui
	public List<String> generateParenthesis(int n) {
		ArrayList<String> pa=new ArrayList<String>();
		if(n<=0)
        	return pa;
        String s="";
		pagenerate(n,n,s,pa);
        return pa;
    	}	
	
	public void pagenerate(int l,int r,String ans,ArrayList<String> pa){		
		if(l<r)
			return;
		if(l==0 && r==0)
			pa.add(ans);
		if(l>0)
			pagenerate(l-1,r,ans+")",pa);
		if(r>0)
			pagenerate(l,r-1,ans+"(",pa);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParentheses pp=new GenerateParentheses();
		for(String str:pp.generateParenthesis(3))
			System.out.println(str);
	}

}
