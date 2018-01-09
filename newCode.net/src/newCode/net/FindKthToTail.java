package newCode.net;



class ListNode {
 	
	  int value;
    ListNode next;
    
    ListNode(int x) //constructor
    { value = x; }

public void print(){
	 int x = value;
	 System.out.print(x);   //
}
}

public class FindKthToTail {
	
	public ListNode FindKthToTail(ListNode head,int k) {
        ListNode node = head;
        int length = 0;
		for (int i = 1; node != null; i++){
            length = i;
            node = node.next;
        }
        if(k>length){
            return null;
        }
        k = length - k ;
        node = head;
        for(int j = 1; j <= k ; j++){
            node = node.next;
        }
        return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
