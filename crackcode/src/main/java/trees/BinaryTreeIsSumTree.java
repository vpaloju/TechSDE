package trees;

public class BinaryTreeIsSumTree {
  TreeNode root;

  static class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int d) {
      data = d;
      left = right = null;
    }
  }

  public boolean isLeaf(TreeNode node) {
    return (node != null) && (node.left == null && node.right == null);
  }

  public boolean isSumTree(TreeNode node) {
    int leftSum, rightSum;

    //If node is NULL or it's a leaf node then return true
    if (node == null) {
      return true;
    }

    if (isSumTree(node.left) && isSumTree(node.right)) {
      //Get the sum of nodes in left sub tree.
      if (node.left == null) {
        leftSum = 0;
      } else if (isLeaf(node.left)) {
        leftSum = node.left.data;
      } else {
        leftSum = 2 * (node.left.data);
      }

      //Get the sum of nodes in right sub tree.
      if (node.right == null) {
        rightSum = 0;
      } else if (isLeaf(node.right)) {
        rightSum = node.right.data;
      } else {
        rightSum = 2 * (node.right.data);
      }

      //If root's data is equal to sum of nodes in left and right subtrees then return true else return false
      if (node.data == leftSum + rightSum) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }


  public boolean isBinaryTreeSumTree(TreeNode node) {
    return (sumOfLeftAndRightSubTrees(node) != -1);
  }

  public int sumOfLeftAndRightSubTrees(TreeNode node) {
    if (node == null)
      return 0;
    else if (isLeaf(node)) {
      return node.data;
    }

    int leftTreeSum = sumOfLeftAndRightSubTrees(node.left);
    int rightTreeSum = sumOfLeftAndRightSubTrees(node.right);
    if (leftTreeSum == -1 || rightTreeSum == -1) {
      return -1;
    }
    if ((leftTreeSum + rightTreeSum) == node.data) {
      return 2 * (node.data);
    } else {
      return -1;
    }

  }

  public static void main(String[] args) {
    BinaryTreeIsSumTree tree = new BinaryTreeIsSumTree();
    tree.root = new TreeNode(13);
    tree.root.left = new TreeNode(10);
    tree.root.right = new TreeNode(3);
    tree.root.left.left = new TreeNode(4);
    tree.root.left.right = new TreeNode(6);
    tree.root.right.right = new TreeNode(3);

    if (tree.isBinaryTreeSumTree(tree.root))
      System.out.println("The given tree is a sum tree");
    else
      System.out.println("The given tree is not a sum tree");

    if (tree.isSumTree(tree.root))
      System.out.println("The given tree is a sum tree");
    else
      System.out.println("The given tree is not a sum tree");

  }
}
