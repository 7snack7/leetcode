public class Solution21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1 = new ListNode(2, l1);
        l1 = new ListNode(1, l1);
        ListNode l2 = new ListNode(4);
        l2 = new ListNode(3, l2);
        l2 = new ListNode(1, l2);
        ListNode l = mergeTwoLists(l1, l2);
        while(l != null){
            System.out.println(l.val);
            l = l.next;
        }
        System.out.println("-------------------");
        ListNode l3 = null;
        ListNode l4 = null;
        l = mergeTwoLists(l3, l4);
        while(l != null){
            System.out.println(l.val);
            l = l.next;
        }
        System.out.println("-------------------");
        ListNode l5 = null;
        ListNode l6 = new ListNode(0);
        l = mergeTwoLists(l5, l6);
        while(l != null){
            System.out.println(l.val);
            l = l.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode list = result;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                list.next = list1;
                list1 = list1.next;
            } else {
                list.next = list2;
                list2 = list2.next;
            }

            list = list.next;
        }

        list.next = (list1 != null) ? list1 : list2;

        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
