package merge;


class ListNode {
 	
	  int value;
    ListNode next;
    ListNode(int x)
    { value = x; }

public void print(){
	 int x = value;
	 System.out.print(x);   //
	}
}

 class LinkList {
	ListNode first;
		
	 public LinkList() {          //define a head node
         this. first = null;  
   } 
	 
	 public ListNode newnode(int x) {
		 ListNode node = new ListNode(x);
		 node.value = x;
		 return node;
	 }
	 
	 public void buildList(int x) {
		  ListNode node = new ListNode(x);
		 first = node;
		 for (int i = 0;i < 2; i++) {
			 node.value = x;
			 node.next = newnode(x);
			 node = node.next;
		 }
	 }	 
	 
	 public void printall() {
		ListNode current = first;
		while (current != null){
			current.print();
			current = current.next;
			}
			System.out.println();
	}
}
public class solution {
	
	 public static LinkList mergeTwoLists(LinkList l1, LinkList l2) {
		 LinkList list = new LinkList();
		 ListNode current = l1.first;
			while (current.next != null){
				current = current.next;
				}
		 ListNode current2 = l2.first;
		 current.next = current2;
//		 ListNode current0 = l1.first;
//		 while (current0 !=null ) {
//			 list.buildList(current0.value);
//		 }
	      return l1;  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList List1 = new LinkList();
		LinkList List2 = new LinkList();
		List1.buildList(0);
		List2.buildList(1);
		List1.printall();
		List2.printall();
		LinkList newList =  mergeTwoLists(List1, List2);
		newList.printall();
	}

}
