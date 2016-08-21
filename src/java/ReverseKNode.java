public class ReverseKNode{
	public ListNode reverseKNode(ListNode head,int k){
		if(head==null || k<1)
			return null;
		
		if(k==1){
			while(head.next!=null)
				head=head.next;
			return head;
		}

		ListNode ln=head;
		boolean flag=false;

		for(int i=0;i<k-1;i++){
			if(ln.next!=null){
				ln=ln.next;
			}

			else{
				flag=true;
				break;
			}
		}

		if(flag)
			return null;

		while(ln.next!=null){
			head=head.next;
			ln=ln.next;
		}
		return head;
	}
}