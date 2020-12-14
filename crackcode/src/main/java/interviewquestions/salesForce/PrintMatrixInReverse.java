package interviewquestions.salesForce;

public class PrintMatrixInReverse {


  public static void reverseMatrix(int[][] a){
    for(int i=a.length-1;i>=0;i--){
      for(int j=a.length-1;j>=0;j--){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    reverseMatrix(a);
  }

}
