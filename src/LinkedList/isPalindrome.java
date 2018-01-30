package LinkedList;

public class isPalindrome {
	
    public int lPalin(ListNode A) {
        if(A == null || A.next == null) {
            return 1;
        }
        ListNode prev = new ListNode(0);
        ListNode current = new ListNode(0);
        ListNode next = new ListNode(0);
        int len = 0;
        current = A;
        while (current.next != null) {
        		current = current.next;
        		len++;
        }
        int cnt = 0 ;
        while(A.next != null  && cnt < len/2) {
        		
        }
        return 0;
    }

}
