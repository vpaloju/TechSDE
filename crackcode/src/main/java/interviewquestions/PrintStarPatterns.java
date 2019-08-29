package interviewquestions;

public class PrintStarPatterns {

    /**
     *
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
     *
     * @param rows
     */
    public static void printInvertedHalfPyramid(int rows) {
        for (int i = rows; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *
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

    public static void main(String[] args) {
        printHalfPyramid(5);
        System.out.println();
        System.out.println("#################");
        System.out.println();
        printInvertedHalfPyramid(5);
        printStairCase(5);
    }
}
