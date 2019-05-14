package interviewquestions.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {

    public String removeDuplicatesInString(String str){
        char[] strCharArray=str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for (int i=0;i<strCharArray.length;i++){
            set.add(strCharArray[i]);
        }
        return set.toString();
    }
}
