public class RevList{
	public ListNode revList(ListNode head){
		//if(head==null || head.next==null)
		//	return head;
		ListNode pNode=head;
		ListNode pPrev=null;
		ListNode tmp=null;

		while(pNode.next!=null){
			tmp=pNode.next;
			pNode.next=pPrev;
			pPrev=pNode;
			pNode=tmp;

		}
		return pNode;
	}
}