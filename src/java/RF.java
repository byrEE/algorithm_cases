
public class RF {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null || head.next==null)
			return null;
		
		ListNode ln=head;
		ListNode ln1=head;
		
		int i=0;
		while(i<n){
			ln1=ln1.next;
			i++;
		}
		//ln1=ln1.next;
		if(ln1==null)
			return head.next;
		
		while(ln1.next!=null){
			ln=ln.next;
			ln1=ln1.next;
		}
		ln.next=ln.next.next;
		
		return head;
}
}
