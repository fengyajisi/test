/**
 * Created by yaoyi on 2017/3/3.
 * I took me almost 4 hours. Yep, I did it finally.
 * Don't forget to add temp = l3 before l3 = l3.next;yoh~~
 * one more thing, coding is and only is debugging!! Just debug!
 */
class ListNode {
    int val;
    ListNode next;
   ListNode(int x) { val = x; }
}
public class ListNodeTest {
    static ListNode ln = null;

    public static void main(String args[]) {
        ListNode l1 = new ListNode(2);
        ListNode a = new ListNode(6);
        ListNode b = new ListNode(7);
        ListNode c = new ListNode(8);
        l1.next = a;
        a.next = b;
        b.next = c;
        ListNode l2 = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(9);
        l2.next = e;
        e.next = f;
        ln = mergeTwoLists(l1, l2);
        while (ln.next != null) {
            System.out.print(ln.val + " ");
            ln = ln.next;
        }
        System.out.print(ln.val);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode temp = null;
        if(l1 == null && l2 == null) return l2;
        else if(l2 == null && l1 != null) return l1;
        else if(l1 == null && l2 == null) System.exit(0);
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                if (l3 == null)
                {l3 = l1;
                temp = l3;}
                 else
                {l3.next = l1;
                    l3 = l3.next;}
                 l1 = l1.next;
            }else if(l1.val > l2.val){
                if (l3 == null){
                    l3 = l2;
                    temp = l3;
                }
                else
                {l3.next = l2;
                l3 = l3.next;}
                l2 = l2.next;
                }
            }
            if (l1 != null) {
                l3.next = l1;
            }
            else if (l2 != null) {
                l3.next = l2;
            }
        l3 = temp;
        return l3;
    }
}



