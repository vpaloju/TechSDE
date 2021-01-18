package interviewquestions.salesForce;

import java.text.NumberFormat;
import java.util.Locale;

public class MostOccuranceChar {

    public static char mostOccuranceChar(String str){
        int[] count = new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        int maxCount = 0;
        char maxOccurChar = ' ';
        for (int i=0;i<str.length();i++){
            if(maxCount<count[str.charAt(i)]){
                maxCount=count[str.charAt(i)];
                maxOccurChar = str.charAt(i);
            }
        }
        return maxOccurChar;
    }

    public static void main(String[] args) {
        System.out.println(mostOccuranceChar("google"));
    }
}
