package interviewquestions.salesForce;

public class PrintDiagonalsOfMatrix {

  public static void printPrimaryDiagonals(int[][] a) {
    System.out.print("Primary Diagonal: ");
    int n = a.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          System.out.print(a[i][j] + ", ");
        }
      }
    }
    System.out.println("");
  }

  public static void printSecondaryDiagonal(int a[][]) {
    System.out.print("Secondary Diagonal: ");
    int n = a.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        // Condition for secondary diagonal
        if ((i + j) == (n - 1)) {
          System.out.print(a[i][j] + ", ");
        }
      }
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    printPrimaryDiagonals(a);
    printSecondaryDiagonal(a);
  }
}
