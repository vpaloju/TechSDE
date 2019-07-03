package interviewquestions.QAProfile;

public class RemoveElementsLessThanGiven {

    int result[];

    public static int[] removeLesserElements(int[] array, int key){
        int n = array.length - 1;
        for (int i = 1; i <= n; i++) {
            int j, valueToBeSort = array[i];
            for (j = i; j > 0 && array[j - 1] > valueToBeSort; j--) {
                array[j] = array[j - 1];
            }
            array[j] = valueToBeSort;
        }
        return array;
    }
}
