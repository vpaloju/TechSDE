package interviewquestions.pega;

/**
 * Print common nodes on path from root (or common ancestors)
 * Last Updated: 13-02-2020
 * Given a binary tree and two nodes, the task is to Print all the nodes that are common for 2 given nodes in a binary tree.
 *
 * Examples:
 *
 * Given binary tree is :
 *                      1
 *                   /    \
 *                 2       3
 *               /   \     /  \
 *              4     5   6    7
 *             /        /  \
 *            8        9   10
 *
 * Given nodes 9 and 7, so the common nodes are:-
 * 1, 3
 */
public class CommonAncestors {
  static class Node {
    int data;
    Node left, right;

    Node(int d) {
      data = d;
      left = null;
      right = null;
    }
  }
  static Node root;
  private static Node findLCA(Node root, int n1, int n2) {
    if (root == null)
      return null;
    // If either n1 or n2 matches with root's key, report the presence by returning root (Note that if a key is ancestor of other, then the ancestor key becomes LCA
    if (root.data == n1 || root.data == n2)
      return root;
    // Look for keys in left and right subtrees
    Node left_lca = findLCA(root.left, n1, n2);
    Node right_lca = findLCA(root.right, n1, n2);
    // If both of the above calls return Non-NULL, then one key is present in once subtree and other is present in other, So this node is the LCA
    if (left_lca != null && right_lca != null)
      return root;
    // Otherwise check if left subtree or right subtree is LCA
    return (left_lca != null) ? left_lca : right_lca;
  }

  private static boolean printAncestors(Node root, int target) {
    /* base cases */
    if (root == null)
      return false;
    if (root.data == target) {
      System.out.print(root.data + " ");
      return true;
    }
    /* If target is present in either left or right
    subtree of this node, then print this node */
    if (printAncestors(root.left, target) ||
      printAncestors(root.right, target)) {
      System.out.print(root.data + " ");
      return true;
    }

    /* Else return false */
    return false;
  }

  // Function to find nodes common to given two nodes
  private static boolean findCommonNodes(Node root, int first,
                                         int second) {
    Node LCA = findLCA(root, first, second);
    if (LCA == null)
      return false;
    printAncestors(root, LCA.data);
    return true;
  }

  public static void main(String[] args) {
    /*Let us create Binary Tree shown in
        above example */
    CommonAncestors tree = new CommonAncestors();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);
    tree.root.left.left.left = new Node(8);
    tree.root.right.left.left = new Node(9);
    tree.root.right.left.right = new Node(10);
    if (findCommonNodes(root, 9, 7) == false)
      System.out.println("No Common nodes");

  }
}
