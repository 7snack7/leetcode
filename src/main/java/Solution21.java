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
        ListNode list = null;
        if (list1 == null && list2 == null) {
            return list;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        list = new ListNode();
        ListNode result = list;

        while (true) {
            if (list1.val < list2.val) {
                list.val = list1.val;
                list1 = list1.next;
            } else {
                list.val = list2.val;
                list2 = list2.next;
            }
            if (list1 == null && list2 == null) {
                break;
            }
            list.next = new ListNode();
            list = list.next;
            if (list1 == null) {
                while (list2 != null) {
                    list.val = list2.val;
                    list2 = list2.next;
                    if (list2 == null) {
                        break;
                    }
                    list.next = new ListNode();
                    list = list.next;
                }
                break;
            }
            if (list2 == null) {
                while (list1 != null) {
                    list.val = list1.val;
                    list1 = list1.next;
                    if (list1 == null) {
                        break;
                    }
                    list.next = new ListNode();
                    list = list.next;
                }
                break;
            }
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
