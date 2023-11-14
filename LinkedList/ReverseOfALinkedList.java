import java.util.Scanner;

public class ReverseOfALinkedList {
     public static ListNode takeInput() {
          Scanner s = new Scanner(System.in);
          int data = s.nextInt();
          ListNode head = null;
          ListNode tail = null;
          while (data != -1) {
               ListNode currentNode = new ListNode(data);
               if (head == null) {
                    head = currentNode;
                    tail = currentNode;
               } else {
                    tail.next = currentNode;
                    tail = currentNode;
               }
               data = s.nextInt();
          }
          s.close();
          return head;
     }

     public static void print(ListNode head) {
          ListNode temp = head;
          while (temp != null) {
               System.out.print(temp.val + " ");
               temp = temp.next;
          }
     }

     public static ListNode reverse(ListNode head) {
          ListNode prev = null;
          ListNode current = head;
          ListNode next;
          while (current != null) {
               next = current.next;
               current.next = prev;
               prev = current;
               current = next;
          }
          return prev;
     }

     public static void main(String[] args) {
          ListNode head = takeInput();
          print(head);
          head = reverse(head);
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