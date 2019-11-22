package arrays;

public class DuplicatesInArray {
    public static void printRepeating(int arr[], int size) {
        int i;
        System.out.println("The repeating elements are: \n");
        for (i = 0; i < size; i++) {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.println("Repeating elements are: "
                        + Math.abs(+arr[i]));
        }
    }

    public static void main(String[] args) {
        printRepeating(new int[]{1,2,3,4,5,6,7,8,9,10,1,2,3,4,5},15);
    }
}
