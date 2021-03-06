package Week4;

import java.io.*;

public class InsertTail {

  public static class Solution {

    static class SinglyLinkedListNode {

      public int data;
      public SinglyLinkedListNode next;

      public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
      }
    }

    static class SinglyLinkedList {

      public SinglyLinkedListNode head;

      public SinglyLinkedList() {
        this.head = null;
      }


    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep,
        BufferedWriter bufferedWriter) throws IOException {
      while (node != null) {
        bufferedWriter.write(String.valueOf(node.data));

        node = node.next;

        if (node != null) {
          bufferedWriter.write(sep);
        }
      }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
      SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
      if (head == null) {
        head = newnode;
        return head;
      }
      SinglyLinkedListNode addtailnode = head;
      while (addtailnode.next != null) {
        addtailnode = addtailnode.next;
      }
      addtailnode.next = newnode;
      return head;
    }

    public static void main(String[] args) throws IOException {

    }

  }
}