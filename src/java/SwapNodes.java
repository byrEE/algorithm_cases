
public class SwapNodes {
	public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
       	return head;
        ListNode l=head;
	    head=head.next;
	    RNode(l);
        return head;
    }
	
	public void RNode(ListNode l){
		ListNode swap1=l;
        ListNode swap2=l;
        if(l.next!=null){
        	swap1=l;
        	l=l.next;
        	swap2=l.next;
        	l.next=swap1;
        	if(swap2!=null){
        	l.next.next=swap2;
        	l=l.next.next;
        	RNode(l);        	    
        	}
        }        
	}

	public ListNode LNGenerator(int n){
		ListNode head=new ListNode(0);
		ListNode l=head;
		for(int i=1;i<n;i++){
			head.next=new ListNode(i);
			head=head.next;
		}
		return l;
	}
	public static void main(String[] args){
		
		SwapNodes sp=new SwapNodes();
		ListNode l2=sp.LNGenerator(11);
		ListNode ln=sp.swapPairs(l2);
		while(ln!=null){
		System.out.println(ln.val);
		ln=ln.next;
		}
	}
}
