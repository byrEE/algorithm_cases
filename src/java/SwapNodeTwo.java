
public class SwapNodeTwo {
	public ListNode swapPairs(ListNode head) {
        ListNode ln=new ListNode(0);
        ln.next=head;
        head=ln;        
	    while(head.next!=null && head.next.next!=null){
	    	ListNode l1=head.next,l2=head.next.next;
	    	
	    	head.next=l2;
	    	l1.next=l2.next;
	    	l2.next=l1;
	    	
	    	head=l1;
	    	    	
	    }	    
        return ln.next;
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
		ListNode l2=sp.LNGenerator(9);
		ListNode ln=sp.swapPairs(l2);
		while(ln!=null){
		System.out.println(ln.val);
		ln=ln.next;
		}
	}
}
