package interviewquestions.serviceNow;

public class PascalTriangle {

  public static void printPascal(int n) {
    for (int row = 1; row <= n; row++) {
      int c = 1; //Represents c(l,i).
      for (int i = 1; i <= row; i++) {
        System.out.print(c + " ");
        c = c * (row - i) / i;
      }
      System.out.println();
    }
  }

  public static void printPascalTriangle(int rows) {
    int coef = 1;
    for (int i = 0; i < rows; i++) {
      for (int space = 1; space < 2*(rows - i); ++space) {
        System.out.print(" ");
      }

      for (int j = 0; j <= i; j++) {
        if (j == 0 || i == 0)
          coef = 1;
        else
          coef = coef * (i - j+1) / j;
        System.out.printf("%4d", coef);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printPascal(5);
    printPascalTriangle(5);
  }
}
