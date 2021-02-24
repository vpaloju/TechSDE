package interviewquestions.salesForce;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertBTIntoItsMirrorTree {

  static BinaryTreeNode root;

  static class BinaryTreeNode {
    BinaryTreeNode left;
    BinaryTreeNode right;
    int data;

    BinaryTreeNode(int data) {
      this.data = data;
      left = right = null;
    }
  }

  public static BinaryTreeNode mirror(BinaryTreeNode node) {
    if (node == null) {
      return node;
    }
    BinaryTreeNode left = mirror(node.left);
    BinaryTreeNode right = mirror(node.right);
    node.left = right;
    node.right = left;
    return node;
  }

  public static void inOrder(BinaryTreeNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.print(node.data + " ");
    inOrder(node.right);
  }

  //The idea is to do queue based level order traversal. While doing traversal, swap left and right children of every node.
  public static void mirrorUsingQueue(BinaryTreeNode root) {
    if (root == null) {
      return;
    }
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (queue.size() > 0) {
      BinaryTreeNode current = queue.peek();
      queue.remove();
      BinaryTreeNode temp = current.left;
      current.left = current.right;
      current.right = temp;
      if (current.left != null) {
        queue.add(current.left);
      }
      if (current.right != null) {
        queue.add(current.right);
      }
    }
  }

  public static void main(String[] args) {
    root = new BinaryTreeNode(1);
    root.left = new BinaryTreeNode(2);
    root.right = new BinaryTreeNode(3);
    root.left.left = new BinaryTreeNode(4);
    root.left.right = new BinaryTreeNode(5);
    System.out.println("Inorder traversal of input tree is :");
    inOrder(root); //4 2 5 1 3
    System.out.println("\n*******************");
    mirror(root);
    System.out.println("Inorder traversal of binary tree is :");
    inOrder(root);//3 1 5 2 4
    System.out.println("\n*******************");
    mirrorUsingQueue(root);
    System.out.println("Inorder traversal of binary tree mirroring use Queue is :");
    inOrder(root);//3 1 5 2 4
  }
}
