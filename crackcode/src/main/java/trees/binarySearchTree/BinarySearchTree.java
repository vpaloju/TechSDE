package trees.binarySearchTree;


public class BinarySearchTree<T extends Comparable<T>> {

  private class TreeNode {
    T data;
    TreeNode left, right;

    TreeNode(T data) {
      this.data = data;
      left = right = null;
    }
  }

  private TreeNode root;
  private int nodeCount = 0;

  public int size() {
    return nodeCount;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public boolean insert(T element) {
    if (contains(element)) {
      return false;
    } else {
      root = insertRecursive(root, element);
      nodeCount++;
      return true;
    }
  }

  public TreeNode insertRecursive(TreeNode root, T element) {
    if (root == null) {
      root = new TreeNode(element);
      return root;
    }
    if (element.compareTo(root.data) < 0) {
      root.left = insertRecursive(root.left, element);
    } else if (element.compareTo(root.data) > 0) {
      root.right = insertRecursive(root.right, element);
    }
    return root;
  }

  public boolean contains(T element) {
    return contains(root, element);
  }

  private boolean contains(TreeNode node, T element) {
    if (node == null) {
      return false;
    }
    int compare = element.compareTo(node.data);
    if (compare < 0) {
      return contains(node.left, element);
    } else if (compare > 0) {
      return contains(node.right, element);
    } else {
      return true;
    }
  }

  public void inOrder(TreeNode root) {
    if (root != null) {
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
    }
  }

  public TreeNode remove(T element) {
    if (contains(root, element)) {
      root = removeRecursive(root, element);
    }
    return root;
  }

  /**
   * 1) Node to be deleted is the leaf: Simply remove from the tree.
   *
   *               50                            50
   *            /     \         delete(20)      /   \
   *           30      70       --------->    30     70
   *          /  \    /  \                     \    /  \
   *        20   40  60   80                   40  60   80
   * 2) Node to be deleted has only one child: Copy the child to the node and delete the child
   *
   *               50                            50
   *            /     \         delete(30)      /   \
   *           30      70       --------->    40     70
   *             \    /  \                          /  \
   *             40  60   80                       60   80
   * 3) Node to be deleted has two children: Find inorder successor of the node. Copy contents of the inorder successor to the node and delete the inorder successor. Note that inorder predecessor can also be used.
   *
   *
   *               50                            60
   *            /     \         delete(50)      /   \
   *           40      70       --------->    40    70
   *                  /  \                            \
   *                 60   80                           80
   * The important thing to note is, inorder successor is needed only when the right child is not empty. In this particular case, inorder successor can be obtained by finding the minimum value in the right child of the node.
   * @param node
   * @param element
   * @return
   */
  private TreeNode removeRecursive(TreeNode node, T element) {
    //Tree is empty.
    if (node == null) {
      return null;
    }
    //Recursive down the Tree.
    int compare = element.compareTo(node.data);
    if (compare < 0) {
      node.left = removeRecursive(node.left, element);
    } else if (compare > 0) {
      node.right = removeRecursive(node.right, element);
    } else {//If the element is same as Root then this is the node to be delete.
      if (node.left == null) {
        return node.right;
      } else if (node.right == null) {
        return node.left;
      }
      // node with two children: Get the inorder successor (smallest in the right subtree)
      node.data = minVal(node, element);
      //Delete the inorder successor
      node.right = removeRecursive(node.right, node.data);
    }
    return node;
  }

  private T minVal(TreeNode node, T element) {
    T minValue = node.data;
    while (node.left != null) {
      minValue = node.left.data;
      node = node.left;
    }
    return minValue;
  }

  public static void main(String[] args) {
    /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);
    tree.inOrder(tree.root); //20 30 40 50 60 70 80
    System.out.println("\nDelete 20");
    tree.remove(20);
    System.out.println(
      "Inorder traversal of the modified tree");
    tree.inOrder(tree.root);

    System.out.println("\nDelete 30");
    tree.remove(30);
    System.out.println(
      "Inorder traversal of the modified tree");
    tree.inOrder(tree.root);

    System.out.println("\nDelete 50");
    tree.remove(50);
    System.out.println(
      "Inorder traversal of the modified tree");
    tree.inOrder(tree.root);
  }

}
