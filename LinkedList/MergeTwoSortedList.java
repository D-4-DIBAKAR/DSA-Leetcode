import java.util.Scanner;

public class MergeTwoSortedList {
     public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
          ListNode dummy = new ListNode(0); // Create a dummy node to simplify merging.
          ListNode current = dummy; // Initialize the current pointer to the dummy node.

          while (list1 != null && list2 != null) {
               if (list1.val < list2.val) {
                    current.next = list1;
                    list1 = list1.next;
               } else {
                    current.next = list2;
                    list2 = list2.next;
               }
               current = current.next;
          }

          // If one of the lists is not empty, link the current node to the remaining
          // list.
          if (list1 != null) {
               current.next = list1;
          } else {
               current.next = list2;
          }

          return dummy.next; // The merged list starts from the next node of the dummy.
     }

     // public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     // ListNode head = null;
     // ListNode tail = null;

     // while (list1 != null && list2 != null) {
     // int val;
     // if (list1.val < list2.val) {
     // val = list1.val;
     // list1 = list1.next;
     // } else {
     // val = list2.val;
     // list2 = list2.next;
     // }

     // ListNode currentNode = new ListNode(val);

     // if (head == null) {
     // head = currentNode;
     // tail = currentNode;
     // } else {
     // tail.next = currentNode;
     // tail = currentNode;
     // }
     // }

     // // If there are remaining elements in list1 or list2, append them to the
     // merged
     // // list.
     // if (list1 != null) {
     // if (head == null) {
     // head = list1;
     // } else {
     // tail.next = list1;
     // }
     // } else if (list2 != null) {
     // if (head == null) {
     // head = list2;
     // } else {
     // tail.next = list2;
     // }
     // }

     // return head;
     // }

     public static ListNode takeInput() {
          Scanner s = new Scanner(System.in);
          int val = s.nextInt();
          ListNode head = null;
          ListNode tail = null;
          while (val != -1) {
               ListNode currentNode = new ListNode(val);
               if (head == null) {
                    head = currentNode;
                    tail = currentNode;
               } else {
                    tail.next = currentNode;
                    tail = currentNode;
               }
               val = s.nextInt();
          }
          s.close();
          return head;
     }

     // public static void print(ListNode head) {
     // ListNode temp = head;
     // while (temp != null) {
     // System.out.print(temp.val + " ");
     // temp=temp.next;
     // }

     // }
     public static void print(ListNode head) {
          if (head == null) {
               return;
          }
          System.out.print(head.val + " ");
          print(head.next);
     }

     public static void main(String[] args) {
          System.out.println("Enter First List");
          ListNode head1 = takeInput();// List 1
          System.out.println("Enter Second List");
          ListNode head2 = takeInput();// List 1
          ListNode head = mergeTwoLists(head1, head2);
          print(head);
     }

}

class ListNode {
     int val;
     ListNode next;

     ListNode(int val) {
          this.val = val;
     }

     ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
     }
}