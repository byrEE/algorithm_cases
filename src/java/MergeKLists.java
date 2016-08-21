import java.util.ArrayList;
import java.util.List;

public class MergeKLists {
	public ListNode mergeKLists(ListNode[] lists) {
	      if(lists.length<1)
	        	return null;	     
	      else
	    	  return merge(lists,0,lists.length-1);
	}
	      /*
	      {
	        	ListNode ans=lists[0];
	        	int len=lists.length/2;
	        	if(len>1){
	        		ListNode[] l1=new ListNode[len];
	        		ListNode[] l2=new ListNode[lists.length-len];
	        		for(int i=0;i<len;i++){
	        			l1[i]=lists[i];
	        		}
	        		for(int i=0;i<l2.length-1;i++){
	        			l2[i]=lists[i+len];
	        		}
	        		ans=mergeTwoLists(mergeKLists(l1),mergeKLists(l2));
	        	}
	        	
	        	return ans;
	        }
	        */
	
	public ListNode merge(ListNode[] ln,int start,int end){
		if(start==end)
			return ln[start];
		int mid=(start+end)/2;
		ListNode left=merge(ln,start,mid);
		ListNode right=merge(ln,mid+1,end);
		ListNode ans=mergeTwoLists(left,right);
		return ans;
	}    
	
	
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
}
