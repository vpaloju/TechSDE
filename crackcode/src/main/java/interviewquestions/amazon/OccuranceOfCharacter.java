package interviewquestions.amazon;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfCharacter {

  public static char maxOccuranceChar(String str) {
    byte[] count = new byte[256];
    for (int i = 0; i < str.length(); i++) {
      count[str.charAt(i)]++;
    }
    for (int i = 0; i < str.length(); i++) {
      System.out.println("Occurance of character " + str.charAt(i) + " is: " + count[str.charAt(i)]);
    }
    int max = -1;
    char result = ' ';
    for (int i = 0; i < str.length(); i++) {
      if (max < count[str.charAt(i)]) {
        max = count[str.charAt(i)];
        result = str.charAt(i);
      }
    }
    return result;
  }

  public static void printOccuranceOfChar(String str) {
    Map<Character, Integer> map = new LinkedHashMap<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (!map.containsKey(str.charAt(i))) {
        map.put(str.charAt(i), 1);
      } else {
        map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
      }
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      sb.append(entry.getKey());
      sb.append(entry.getValue());
    }
    System.out.println(sb.toString());
  }

  public static void printCharFollowedByOccurance(String str) {
    StringBuilder sb = new StringBuilder();
    int[] map = new int[256];
    for (int i = 0; i < str.length(); i++) {
      map[str.charAt(i)]++;
    }
    for (int i = 0; i < str.length(); i++) {
      sb.append(str.charAt(i));
      sb.append(map[str.charAt(i)]);
    }
    System.out.println(sb.toString());
  }

  static class Node {
    Node next;
    int data;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public static Node reverseLinkedList(Node head) {
    Node current = head, prev = null, next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  public static void printList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  public static void main(String[] args) {
    System.out.println(maxOccuranceChar("sample string"));
    printOccuranceOfChar("sample string");
    printCharFollowedByOccurance("sample string");
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    System.out.println("Orginal List is");
    printList(head);
    System.out.println("\nReversed List is");
    printList(reverseLinkedList(head));

  }
}
