//Definition for singly-linked list.

import java.util.Scanner;

class ListNode {
     int val;
     ListNode next;

     ListNode() {
     }

     ListNode(int val) {
          this.val = val;
     }

     ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
     }

}

public class MiddleOfTheLinkedList {
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

     public static void printLL(ListNode head) {
          ListNode temp = head;
          while (temp != null) {
               System.out.print(temp.val + " ");
               System.out.print(temp + " ");
               System.out.println();
               temp = temp.next;
          }
     }

     public static ListNode middleNode(ListNode head) {
          // ListNode temp = head;
          ListNode slow = head;
          ListNode fast = head;
          while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;
          }

          return slow;
     }

     public static void main(String[] args) {
          ListNode head = takeInput();
          printLL(head);
          middleNode(head);
     }
}