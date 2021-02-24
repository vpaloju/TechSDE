package interviewquestions.salesForce;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrderTraversal {

  static class BinraryTreeNode {
    BinraryTreeNode left, right;
    int data;

    BinraryTreeNode(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static int height(BinraryTreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
  }

  public static void printGivenLevel(BinraryTreeNode root, int level) {
    if (root == null) {
      return;
    }
    if (level == 1) {
      System.out.print(root.data + " ");
    } else if (level > 1) {
      printGivenLevel(root.left, level - 1);
      printGivenLevel(root.right, level - 1);
    }
  }

  public static void printLevelOrder(BinraryTreeNode root) {
    int height = height(root);
    for (int i = 0; i <= height; i++) {
      printGivenLevel(root, i);
    }
  }

  public static void printLevelOrderUsingQueue(BinraryTreeNode root) {
    Queue<BinraryTreeNode> queue = new LinkedList<BinraryTreeNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinraryTreeNode tempNode = queue.poll();
      System.out.print(tempNode.data + " ");
      /*Enqueue left child */
      if (tempNode.left != null) {
        queue.add(tempNode.left);
      }
      /*Enqueue right child */
      if (tempNode.right != null) {
        queue.add(tempNode.right);
      }
    }
  }

  public static void main(String[] args) {
    BinraryTreeNode root = new BinraryTreeNode(1);
    root.left = new BinraryTreeNode(2);
    root.right = new BinraryTreeNode(3);
    root.left.left = new BinraryTreeNode(4);
    root.left.right = new BinraryTreeNode(5);
    System.out.println("Level order traversal of binary tree is ");
    printLevelOrder(root);
    System.out.println("\n**********************");
    System.out.println("Level order traversal of binary tree is using QUEUE ");
    printLevelOrderUsingQueue(root);
  }
}
