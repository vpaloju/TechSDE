package interviewquestions;

public class PrintStarPatterns {

  /**
   * @param rows
   */
  public static void printHalfPyramid(int rows) {
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /**
   * @param rows
   */
  public static void printHalfPyramidNumbers(int rows) {
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  /**
   * @param rows
   */
  public static void printInvertedHalfPyramid(int rows) {
    for (int i = rows; i >= 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /**
   * @param rows
   */
  public static void printStairCase(int rows) {
    for (int j = 0; j < rows; j++) {
      for (int i = 1; i <= rows; i++) {
        System.out.print(i < rows - j ? " " : "#");
      }
      System.out.println("");
    }
  }

  public static void pyramidPattern(int rows) {
    for (int i = 1; i <= rows; ++i) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }
      for (int k = 1; k < 2 * i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void printpyramidPattern(int n) {
    for (int i = 0; i < n; i++) //outer loop for number of rows(n)
    {
      for (int j = n - i; j > 1; j--) //inner loop for spaces
      {
        System.out.print(" "); //print space
      }
      for (int j = 0; j <= i; j++) //inner loop for number of columns
      {
        System.out.print("* "); //print star
      }

      System.out.println(); //ending line after each row
    }
  }

  public static void printStars(int n) {
    int i, j;
    for (i = 0; i < n; i++) //outer loop for number of rows(n)
    {
      for (j = 2 * (n - i); j >= 0; j--) // inner loop for spaces
      {
        System.out.print(" "); // printing space
      }
      for (j = 0; j <= i; j++) //  inner loop for columns
      {
        System.out.print("* "); // print star
      }
      System.out.println(); // ending line after each row
    }
  }

  public static void rightTriangle(int n) {
    int i, j;
    for (i = 0; i < n; i++) //outer loop for number of rows(n)
    {
      for (j = 2 * (n - i); j >= 0; j--) // inner loop for spaces
      {
        System.out.print(" "); // printing space
      }
      for (j = 0; j <= i; j++) //  inner loop for columns
      {
        System.out.print("* "); // print star
      }
      System.out.println(); // ending line after each row
    }
  }

  /**
   *
   * *
   * * *
   * * * *
   * * * * *
   * @param rows
   */
  public static void printRightTriangle(int rows) {
    int i, j;
    for (i = 0; i < rows; i++) {
      for (j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /**
   * @param rows
   */
  public static void printLeftTriangle(int rows) {
    int i, j;
    for (i = 0; i < rows; i++) {
      for (j = 2 * (rows - i); j >= 0; j--) {
        System.out.print(" ");
      }
      for (j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 5;
    printHalfPyramid(n);
    printHalfPyramidNumbers(n);
    System.out.println();
    System.out.println("#################");
    System.out.println();
    printInvertedHalfPyramid(n);
    printStairCase(n);
    pyramidPattern(n);
    /*printpyramidPattern(n);
    printStars(5);
    printRightTriangle(5);
    printLeftTriangle(5);*/
  }
}
