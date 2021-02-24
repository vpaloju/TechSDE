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
    if (node == null || isLeaf(node)) {
      return true;
    }
    if (isSumTree(node.left) && isSumTree(node.right)) {
      // Get the sum of nodes in left subtree
      if (node.left == null) {
        leftSum = 0;
      } else if (isLeaf(node.left)) {
        leftSum = node.left.data;
      } else {
        leftSum = 2 * (node.left.data);
      }
      if (node.right == null) {
        rightSum = 0;
      } else if (isLeaf(node.right)) {
        rightSum = node.right.data;
      } else {
        rightSum = 2 * (node.right.data);
      }
      if ((node.data == rightSum + leftSum)) {
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
    if (node == null) {
      return 0;
    } else if (isLeaf(node)) {
      return node.data;
    }
    int leftSum = sumOfLeftAndRightSubTrees(node.left);
    int rightSum = sumOfLeftAndRightSubTrees(node.right);
    if (leftSum == -1 || rightSum == -1) {
      return -1;
    }
    if (leftSum + rightSum == node.data) {
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
    System.out.println("****************************");
    BinaryTreeIsSumTree sumTree = new BinaryTreeIsSumTree();
    sumTree.root = new TreeNode(26);
    sumTree.root.left = new TreeNode(10);
    sumTree.root.right = new TreeNode(3);
    sumTree.root.left.left = new TreeNode(4);
    sumTree.root.left.right = new TreeNode(6);
    sumTree.root.right.right = new TreeNode(3);

    if (tree.isBinaryTreeSumTree(sumTree.root))
      System.out.println("The given tree is a sum tree");
    else
      System.out.println("The given tree is not a sum tree");

    if (tree.isSumTree(sumTree.root))
      System.out.println("The given tree is a sum tree");
    else
      System.out.println("The given tree is not a sum tree");
  }
}
