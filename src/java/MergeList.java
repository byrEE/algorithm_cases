public class MergeList{
	public ListNode mergeList(ListNode ln1,ListNode ln2){
		if(ln1.value==null)
			return ln2;
		else if(ln2.value==null)
			return ln1;

		if(ln1.value<=ln2.value){
			ln1.next=mergeList(ln1.next,ln2);
			return ln1;
		}
		else{
			ln2.next=mergeList(ln,ln2.next);
			return ln2;
		}
	}
}