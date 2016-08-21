public class RebuildTree{
	public ListNode rebuildList(int[] firstSeq,int[] midSeq){
		//ListNode root=ListNode(firstSeq[0]);
		if(firstSeq.length!=midSeq.length)
			throw new NullPointerException();

		if(firstSeq.length<1 || midSeq.length<1)
			return new ListNode();

		int len=firstSeq.length;
		return buildTree(firstSeq,0,len,midSeq,0,len);
	} 

	private ListNode buildTree(int[] firstSeq,int first,int firstlen,int[] midSeq,int mid,int midlen){
		ListNode root=new ListNode(firstSeq[first]);
		for(int i=first;i<firstlen;i++){
			if(midSeq[i]==firstSeq[first]){
				if(i-1>=0){
					root.left=new ListNode(firstSeq[first+1]);
					buildTree(firstSeq,first+1,i-first+1,midSeq,mid,i);
				}
				if(i+1<firstSeq.length){
					root.right=new ListNode(firstSeq[i+1]);
					buildTree(firstSeq,i+1,firstlen,midSeq,i+1,midlen);
				}
			}
		}
		return root;
	}
}