package interviewquestions;

public class PrintStartsPattern {

    public static void printStarsPattern(int n){
        for(int i=1;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        printStarsPattern(10);
    }
}
