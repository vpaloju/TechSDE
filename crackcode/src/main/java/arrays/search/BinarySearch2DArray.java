package arrays.search;

public class BinarySearch2DArray {

    public static boolean binarySearch(int[][] a, int key) {
        int row = 0, length = a.length, column = length;
        while (row < length && column >= 0) {
            if (key == a[row][column]) {
                return true;
            }
            if (key < a[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void find(int[][] a, int key) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= a.length; j++) {
                if (a[i][j] == key) {
                    System.out.println("The element: " + key + " is found at row: " + i + " at column: " + j);
                    return;
                }
            }
        }
        System.out.println("The key: " + key + " not found in the given matrix!");
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[][]{{0, 6, 8, 9, 11},
                {20, 22, 28, 29, 31},
                {36, 38, 50, 61, 63},
                {64, 66, 100, 122, 128}}, 128));
        find(new int[][]{{0, 6, 8, 9, 11},
                {20, 22, 28, 29, 31},
                {36, 38, 50, 61, 63},
                {64, 66, 100, 122, 128}}, 0);
    }
}
