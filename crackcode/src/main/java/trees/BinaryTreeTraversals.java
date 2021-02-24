package trees;

/**
 * Tree Traversals (Inorder, Preorder and Postorder)
 */
public class BinaryTreeTraversals {
  static BinaryTreeNode root;

  static class BinaryTreeNode {
    BinaryTreeNode left, right;
    int data;

    BinaryTreeNode(int d) {
      data = d;
      left = null;
      right = null;
    }
  }

  /**
   * Postorder(left-subtree)
   * Postorder(right-subtree)
   * Vist the root and print
   *
   * @param node
   */
  public static void printPostOrder(BinaryTreeNode node) {
    if (node == null) {
      return;
    }
    printPostOrder(node.left);
    printPostOrder(node.right);
    System.out.print(node.data + " ");
  }

  /**
   * Inorder(left-subtree)
   * Visit root and print
   * Inorder(right-subtree)
   *
   * @param node
   */
  public static void printInOrder(BinaryTreeNode node) {
    if (node == null) {
      return;
    }
    printInOrder(node.left);
    System.out.print(node.data + " ");
    printInOrder(node.right);
  }

  /**
   * Vist the root and print
   * Preorder(left-subtree)
   * Preorder(right-subtree)
   *
   * @param node
   */
  public static void printPreOrder(BinaryTreeNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + " ");
    printPreOrder(node.left);
    printPreOrder(node.right);
  }

  public static void main(String[] args) {
    root = new BinaryTreeNode(1);
    root.left = new BinaryTreeNode(2);
    root.right = new BinaryTreeNode(3);
    root.left.left = new BinaryTreeNode(4);
    root.left.right = new BinaryTreeNode(5);
    System.out.println("Preorder traversal of binary tree is ");
    printPreOrder(root);

    System.out.println("\nInorder traversal of binary tree is ");
    printInOrder(root);

    System.out.println("\nPostorder traversal of binary tree is ");
    printPostOrder(root);
  }
}
