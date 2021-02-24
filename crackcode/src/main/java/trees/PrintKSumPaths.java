package trees;

import java.util.Vector;

/**
 * Print all k-sum paths in a binary tree
 * Difficulty Level : Hard
 * Last Updated : 02 Nov, 2020
 * A binary tree and a number k are given. Print every path in the tree with sum of the nodes in the path as k.
 * A path can start from any node and end at any node and must be downward only, i.e. they need not be root node and leaf node; and negative numbers can also be there in the tree.
 * <p>
 * Examples:
 * <p>
 * Input : k = 5
 * Root of below binary tree:
 * 1
 * /     \
 * 3        -1
 * /   \     /   \
 * 2     1   4     5
 * /   / \     \
 * 1   1   2     6
 * <p>
 * Output :
 * 3 2
 * 3 1 1
 * 1 3 1
 * 4 1
 * 1 -1 4 1
 * -1 4 2
 * 5
 * 1 -1 5
 */
public class PrintKSumPaths {

  static Vector<Integer> path = new Vector<>();

  static class BinaryTreeNode {
    BinaryTreeNode left, right;
    int data;

    BinaryTreeNode(int d) {
      data = d;
      left = null;
      right = null;
    }
  }

  public static void printVector(Vector v, int index) {
    for (int i = index; i < v.size(); i++) {
      System.out.print(v.get(i) + " ");
    }
    System.out.println();
  }

  public static void printKPathUtil(BinaryTreeNode root, int k) {
    if (root == null) {
      return;
    }
    path.add(root.data);
    printKPathUtil(root.left, k);
    printKPathUtil(root.right, k);
    int f = 0;
    for (int i = path.size() - 1; i >= 0; i--) {
      f += path.get(i);
      if (f == k) {
        printVector(path, i);
      }
    }
    path.remove(path.size() - 1);
  }

  public static void printKPath(BinaryTreeNode root, int k) {
    printKPathUtil(root, k);
  }

  public static void main(String[] args) {
    BinaryTreeNode root = new BinaryTreeNode(1);
    root.left = new BinaryTreeNode(3);
    root.left.left = new BinaryTreeNode(2);
    root.left.right = new BinaryTreeNode(1);
    root.left.right.left = new BinaryTreeNode(1);
    root.right = new BinaryTreeNode(-1);
    root.right.left = new BinaryTreeNode(4);
    root.right.left.left = new BinaryTreeNode(1);
    root.right.left.right = new BinaryTreeNode(2);
    root.right.right = new BinaryTreeNode(5);
    root.right.right.right = new BinaryTreeNode(2);

    int k = 5;
    printKPath(root, k);
  }

}
