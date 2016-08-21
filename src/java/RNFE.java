
public class RNFE {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null)
			return null;
		
		ListNode ln=head;
		int len=0;
		while(ln!=null){
			len++;
			ln=ln.next;
		}
		
		int from=len-n+1;
		if(from==1)
			return head.next;
		
		ln=head;
		int i=0;
		while(ln!=null){
			i++;
			if(i==from-1)
				break;
			ln=ln.next;
		}
		ln.next=ln.next.next;
		
		return head;
        
    }
	public static void main(String[] args){
		ListNode LN=new ListNode(0);
		ListNode LN1=LN;
		for(int i=0;i<9;i++){
			LN.next=new ListNode(i);
			LN=LN.next;
		}
		RNFE l=new RNFE();
		l.removeNthFromEnd(LN1,7);
	}
}
