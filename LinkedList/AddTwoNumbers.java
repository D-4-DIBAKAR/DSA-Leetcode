import java.util.Scanner;

public class AddTwoNumbers {
     /**
      * Definition for singly-linked list.
      * public class ListNode {
      * int val;
      * ListNode next;
      * ListNode() {}
      * ListNode(int val) { this.val = val; }
      * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      * }
      */
     static class ListNode {
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

     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode dummyHead = new ListNode();
          ListNode current = dummyHead;
          int carry = 0;

          while (l1 != null || l2 != null || carry != 0) {
               int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
               carry = sum / 10;

               current.next = new ListNode(sum % 10);
               current = current.next;

               if (l1 != null)
                    l1 = l1.next;
               if (l2 != null)
                    l2 = l2.next;
          }

          return dummyHead.next;
     }

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
          return head;
     }

     public static void print(ListNode head) {
          ListNode temp = head;
          while (temp != null) {
               System.out.print(temp.val + " ");
               temp = temp.next;
          }
     }

     public static void main(String[] args) {
          System.out.println("Enter First LinkedList");
          ListNode head1 = takeInput();
          System.out.println("Enter Second LinkedList");
          ListNode head2 = takeInput();
          ListNode head = addTwoNumbers(head1, head2);
          print(head);
     }
}

// class ListNode {
// int data;
// ListNode next;

// public ListNode(int data) {
// this.data = data;
// this.next = null;
// }
// }

/*
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 * 
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */