
public class ReverseNodesKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		if(k<2 || head==null || head.next==null)
			return head;
		
		ListNode l=head,ln=head;
		int len=0;
		while(l!=null){
			len++;
			l=l.next;
		}
		int m=len/k;
		if(m<1)
			return head;
		
		int[][] mn=new int[m][k];
		while(ln!=null){
			for(int i=0;i<m;i++){
				for(int j=k;j>0;j--){
					mn[i][j]=ln.val;
					ln=ln.next;
				}					
			}			
		}
		l=head;
		for(int i=0;i<m;i++){
			for(int j=0;j<k;j++){
				l.val=mn[i][j];
				l=l.next;
			}					
		}
		l.next=ln;		
		return head;				
    	}
}
