package hashing;


import java.util.*;

public class VerticalOrderBinaryTree {

  class Values {
    int min, max;
  }

  public void verticalOrder(BinaryTreeNode node) {
    Values values = new Values();
    TreeMap<Integer, List<Integer>> map = new TreeMap<>();
    findHorizonatalDistance(node, values, values, 0, map);
    for (List<Integer> list : map.values()) {
      System.out.println(list);
    }
  }

  private void findHorizonatalDistance(BinaryTreeNode node, Values min, Values max, int hd, TreeMap<Integer, List<Integer>> map) {
    if (node == null) {
      return;
    }
    if (hd < min.min) {
      min.min = hd;
    }
    if (hd > max.max) {
      max.max = hd;
    }
    map.computeIfAbsent(hd, k -> new ArrayList<Integer>()).add(node.key);
    findHorizonatalDistance(node.left, min, max, hd - 1, map);
    findHorizonatalDistance(node.right, min, max, hd + 1, map);
  }

  private static class BinaryTreeNode {
    BinaryTreeNode left, right;
    int key;

    public BinaryTreeNode(int data) {
      left = right = null;
      this.key = data;
    }
  }

  public static void getVerticalOrder(BinaryTreeNode root, int hd, TreeMap<Integer, Vector<Integer>> map) {
    if (root == null) {
      return;
    }
    Vector<Integer> get = map.get(hd);
    if (get == null) {
      get = new Vector<>();
    }
    get.add(root.key);
    map.put(hd, get);
    getVerticalOrder(root.left, hd - 1, map);
    getVerticalOrder(root.right, hd + 1, map);
  }

  public static void printVerticalOrder(BinaryTreeNode root) {
    TreeMap<Integer, Vector<Integer>> map = new TreeMap<>();
    int hd = 0;
    getVerticalOrder(root, hd, map);
    for (Map.Entry<Integer, Vector<Integer>> entry : map.entrySet()) {
      System.out.println(entry.getValue());
    }
  }

  public static void main(String[] args) {
    // TO DO Auto-generated method stub
    BinaryTreeNode root = new BinaryTreeNode(1);
    root.left = new BinaryTreeNode(2);
    root.right = new BinaryTreeNode(3);
    root.left.left = new BinaryTreeNode(4);
    root.left.right = new BinaryTreeNode(5);
    root.right.left = new BinaryTreeNode(6);
    root.right.right = new BinaryTreeNode(7);
    root.right.left.right = new BinaryTreeNode(8);
    root.right.right.right = new BinaryTreeNode(9);
    System.out.println("Vertical Order traversal is");
    printVerticalOrder(root);
    System.out.println("*********");
    VerticalOrderBinaryTree vbt = new VerticalOrderBinaryTree();
    vbt.verticalOrder(root);
    System.out.println("*********");
    BinaryTreeNode root1 = new BinaryTreeNode(1);
    root1.left = new BinaryTreeNode(2);
    root1.right = new BinaryTreeNode(3);
    root1.left.left = new BinaryTreeNode(4);
    root1.left.right = new BinaryTreeNode(5);
    root1.right.left = new BinaryTreeNode(6);
    root1.right.right = new BinaryTreeNode(7);
    root1.right.left.right = new BinaryTreeNode(8);
    root1.right.right.right = new BinaryTreeNode(9);
    printVerticalOrder(root1);
    System.out.println("*********");
    vbt.verticalOrder(root1);
  }
}
