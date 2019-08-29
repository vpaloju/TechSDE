package interviewquestions.arrays;

public class TransposeMatrix {

    public static int[][] transposeMatrix(int[][] a,int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};
        int[][] b = new int[a.length][a.length];
        transposeMatrix(a,b);
        System.out.print("Result matrix is \n");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++)
                System.out.print(b[i][j] + " ");
            System.out.print("\n");
        }
    }
}
