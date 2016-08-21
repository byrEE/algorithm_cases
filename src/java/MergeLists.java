
public class MergeLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {     
		if(l1==null || l2==null)
			return l1==null?l2:l1;		
		
		ListNode tmp1=new ListNode(0);
		if(l1.val>l2.val){
			tmp1=l1;
			l1=l2;
			l2=tmp1;
		}
		
		ListNode tmp=l1,swap=l1;
		//if(l1.val<=l2.val){
		ListNode l=l1;
		while(l!=null && l2!=null){
        	if(l.val<=l2.val){
        		swap=l;
        		l=l.next;
        	}
        	else{        		
        		tmp=l2.next;
        		swap.next=l2;
        		swap=swap.next;
        		swap.next=l;
        		l2=tmp;
        	}
		}
		swap.next=(l!=null)?l:l2;        	
        
        return l1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(3);
		ListNode l2=new ListNode(8);
		l2.next=new ListNode(9);
		MergeLists b=new MergeLists();
		ListNode a=b.mergeTwoLists(l1,l2);
		
		while(a!=null){
			System.out.print(a.val);
			a=a.next;
		}

	}

}
