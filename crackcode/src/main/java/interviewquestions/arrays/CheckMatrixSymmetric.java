package interviewquestions.arrays;

public class CheckMatrixSymmetric {

    public static boolean isSymmetric(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]!=a[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSymmetric(new int[][]{ { 1, 3, 5 },
                { 3, 2, 4 },
                { 5, 4, 1 } }));
    }
}
