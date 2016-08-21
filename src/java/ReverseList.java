
public class ReverseList{
	public void reverseList(ListNode head){
		if(head==null)
			return;
		if(head.next!=null){
			reverseList(head.next);
		}
		System.out.println(head.value);
					
	}

	static class ListNode{
	public int value;
	//private int i=0;
	public ListNode next=null;
 	
 	public ListNode(int value){
 		this.value=value;
 	}

 	public int getValue(){
 		return value;
 	}

 	public void setValue(int value){
 		this.value=value;
 	}

 	public void setNext(ListNode listNode){
 		this.next=listNode;
 	}
	
}

	public static void main(String[] args){
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		ListNode l6=new ListNode(6);
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(l5);
		l5.setNext(l6);

		ReverseList rl=new ReverseList();
		rl.reverseList(l1);

	}
}