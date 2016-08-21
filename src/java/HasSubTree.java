public class HasSubTree{
	public boolean hasSubTree(TreeNode root1,TreeNode root2){
		boolean result=false;

		if(root1!=null && root2!=null){
		if(root1.value==root2.value)
			result=isSubTree(root1,root2);
		if(!result){
			root1=root1.left;
			result=hasSubTree(root1,root2);
		}
		if(!result){
			root1=root1.right;
			result=hasSubTree(root1,root2);
		}

		return result;
	}
}
	public boolean isSubTree(TreeNode tn1,TreeNode tn2){
		//boolean ist=false;
		if(tn2==null)
			return true;
		if(tn1==null)
			return false;

		if(tn1.value!=tn2.value)
			return false;

		return isSubTree(tn1.left,tn2.left) && isSubTree(tn1.right,tn2.right);

	}
}