package interviewquestions.salesForce;

public class CommonAncestors {
  static TreeNode root;

  static class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int d) {
      data = d;
    }
  }

  public static TreeNode commonAncesstor(TreeNode root, TreeNode n1, TreeNode n2) {
    if (root == null) {
      return null;
    }
    if (root == n1 || root == n2) {
      return root;
    }
    TreeNode left = commonAncesstor(root.left, n1, n2);
    TreeNode right = commonAncesstor(root.right, n1, n2);
    if (left != null && right != null) {
      return root;
    }
    return left != null ? left : right;
  }

  public static void main(String[] args) {
    CommonAncestors tree = new CommonAncestors();
    tree.root = new TreeNode(1);
    tree.root.left = new TreeNode(2);
    tree.root.right = new TreeNode(3);
    tree.root.left.left = new TreeNode(4);
    tree.root.left.right = new TreeNode(5);
    tree.root.right.left = new TreeNode(6);
    tree.root.right.right = new TreeNode(7);
    tree.root.left.left.left = new TreeNode(8);
    tree.root.right.left.left = new TreeNode(9);
    tree.root.right.left.right = new TreeNode(10);
    System.out.println(commonAncesstor(root, tree.root.right.left.left, tree.root.right.right).data);
  }
}

