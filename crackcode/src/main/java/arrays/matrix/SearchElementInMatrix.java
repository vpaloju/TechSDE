package arrays.matrix;

public class SearchElementInMatrix {

  public static void search(int[][] a, int x) {
    int i = 0, j = a.length - 1;
    while (i < a.length && j >= 0) {
      if (x == a[i][j]) {
        System.out.println("The give element " + x + " found at " + i + ", " + j);
        return;
      }
      if (a[i][j] > x) {
        j--;
      } else {
        i++;
      }
    }

    System.out.println("The given element " + x + " not found!");
  }

  public static void main(String[] args) {
    int[][] a = {{10, 20, 30, 40},
      {15, 25, 35, 45},
      {27, 29, 37, 48},
      {32, 33, 39, 50}};
    search(a, 29);
  }
}
