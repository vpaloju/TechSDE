package interviewquestions.salesForce;

public class SymmetricMatrix {

    public static boolean isSymmetric(int[][] a) {
        int[][] b = transposeMatrix(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static int[][] transposeMatrix(int[][] a) {
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 3, 5 },
                { 3, 2, 4 },
                { 5, 4, 1 } };
        if(isSymmetric(a)){
            System.out.println("The give matrix is Symmetric");
        }else{
            System.out.println("The give matrix is not Symmetric");
        }
    }
}
