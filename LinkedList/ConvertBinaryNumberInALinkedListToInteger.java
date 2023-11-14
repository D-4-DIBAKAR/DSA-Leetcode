
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

public class ConvertBinaryNumberInALinkedListToInteger {
     public static void printLL(ListNode head) {
          ListNode temp = head;
          while (temp != null) {
               System.out.print(temp.val + " ");
               temp = temp.next;
          }
          // System.out.println();
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
          s.close();
          return head;
     }

     public static int getDecimalValue(ListNode head) {
          ListNode temp = head;
          String binaryString = "";
          while (temp != null) {
               binaryString += temp.val;
               temp = temp.next;
          }
          int decimalValue = Integer.parseInt(binaryString, 2);
          return decimalValue;
     }

     public static void main(String[] args) {
          ListNode head = takeInput();
          printLL(head);
          int decimalValue = getDecimalValue(head);
          System.out.println(decimalValue);
     }
}
/*
 * Given head which is a reference node to a singly-linked list. The value of
 * each node in the linked list is either 0 or 1. The linked list holds the
 * binary representation of a number.
 * 
 * Return the decimal value of the number in the linked list.
 * 
 * The most significant bit is at the head of the linked list.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [1,0,1]
 * Output: 5
 * Explanation: (101) in base 2 = (5) in base 10
 * Example 2:
 * 
 * Input: head = [0]
 * Output: 0
 * 
 * 
 * Constraints:
 * 
 * The Linked List is not empty.
 * Number of nodes will not exceed 30.
 * Each node's value is either 0 or 1.
 */