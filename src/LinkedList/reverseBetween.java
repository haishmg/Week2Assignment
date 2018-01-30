package LinkedList;

public class reverseBetween {
	
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    ListNode b = new ListNode(0);
	    b.next = a;
	    
	    ListNode head = null;
	    ListNode node = b;
	    ListNode preHead = null;
	    ListNode tail = null;
	    
	    for (int i = 0; i <= n; i++) {
	        ListNode temp = node.next;
	        
	        if (i == m - 1) {
	            preHead = node;
	        }
	        
	        if (i == m) {
	            tail = node;
	        }
	        
	        if (i >= m) {
	            node.next = head;
	            head = node;
	        } 
	        
	        node = temp;
	    }
	    
	    preHead.next = head;
	    tail.next = node;
	    
	    return b.next;
	}

}
