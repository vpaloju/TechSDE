package interviewquestions.arrays;

public class MaxElementInArray {

    public static int maxElement(int[] a){
        int maxElement = a[0];
        for(int i=1;i<a.length;i++){
            if(maxElement<a[i]){
                maxElement=a[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        System.out.println(maxElement(new int[]{10, 324, 45, 90, 9808}));
    }
}
