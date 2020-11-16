package interviewquestions.serviceNow;

public class PascalTriangle {

  public static void printPascal(int n) {
    for (int line = 1; line <= n; line++) {
      int c = 1; //Represents c(l,i).
      for (int i = 1; i <= line; i++) {
        System.out.print(c + " ");
        c = c * (line - i) / i;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printPascal(5);


  }
}
