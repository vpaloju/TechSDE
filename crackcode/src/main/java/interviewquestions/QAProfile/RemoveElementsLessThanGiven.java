package interviewquestions.QAProfile;

import java.util.Arrays;
import java.util.List;

public class RemoveElementsLessThanGiven {

    int result[];

    public static int[] removeLesserElements(int[] array, int key){
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<key){
                array[i]=array[i+1];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeLesserElements(new int[]{1,2,3,4,5,10,7,9,8,6},5)));
        List<String> names = Arrays.asList(new String[]{"Ramana","chary","venkat","paloju"});
        System.out.println(String.join(",",names) );
    }
}
