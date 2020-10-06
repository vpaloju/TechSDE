package interviewquestions.salesForce;

public class MatrixAddition {

    public static int[][] matrixSum(int[][] a,int[][]b){
        int[][] c = new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
        int[][] c = matrixSum(a,b);
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
