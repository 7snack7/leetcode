public  class SolutionAddTwoNumbers {
    public static void main(String[] args) {
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
        ListNode l1 = new ListNode(3);
        l1 = new ListNode(4, l1);
        l1 = new ListNode(2, l1);
        ListNode l2 = new ListNode(4);
        l2 = new ListNode(6, l2);
        l2 = new ListNode(5, l2);
        ListNode l = addTwoNumbers(l1, l2);
        while(l != null){
            System.out.println(l.val);
            l = l.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nextList = new ListNode(0, null);
        int carry = 0;
        ListNode head = nextList;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            nextList.val = sum % 10;
            carry = sum / 10;
            if(l1 != null || l2 != null || carry > 0) {
                nextList.next = new ListNode(0, nextList);
                nextList = nextList.next;
            }
        }
        nextList.next = null;
        return head;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }