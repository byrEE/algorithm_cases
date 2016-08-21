
public class MListnew {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {     
	if(l1==null || l2==null)
		return l1==null?l2:l1;		
	
	ListNode l=new ListNode(7);
	ListNode tmp=l;
	
	while(l1!=null && l2!=null){
    	if(l1.val<l2.val){
    		//l.next=new ListNode(0);
    		l=l1;
    		l1=l1.next;
    		l.next=new ListNode(0);
    		l=l.next;
    	}
    	else{        		
    		//l.next=new ListNode(0);
    		l=l2;
    		l2=l2.next;
    		l.next=new ListNode(0);
    		l=l.next;
    	}
	}
   	 l=(l1!=null)?l1:l2;
            
    return tmp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(2);
		//l1.next=new ListNode(3);
		ListNode l2=new ListNode(1);
		l2.next=new ListNode(5);
		MListnew b=new MListnew();
		ListNode a=b.mergeTwoLists(l1, l2);
		
		while(a!=null){
			System.out.print(a.val);
			a=a.next;
		}
	}

}
