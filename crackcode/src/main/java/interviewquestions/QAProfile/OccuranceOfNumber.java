package interviewquestions.QAProfile;


import java.util.HashMap;
import java.util.Map;

public class OccuranceOfNumber {

    public static int occuranceOfNumber(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                map.put(array[i],map.get(array[i])+1);
            }
            if(map.get(array[i])==(array.length/2)-1){
                return array[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(occuranceOfNumber(new int[]{1,2,3,4,5,6,6,6}));
    }
}
