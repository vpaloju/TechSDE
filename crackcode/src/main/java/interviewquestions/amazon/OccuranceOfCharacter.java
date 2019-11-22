package interviewquestions.amazon;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfCharacter {

    public static char maxOccuranceChar(String str) {
        byte[] count = new byte[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            System.out.println("Occurance of character "+str.charAt(i)+" is: "+count[str.charAt(i)]);
        }
        int max = -1;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void printOccuranceOfChar(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(maxOccuranceChar("sample string"));
        printOccuranceOfChar("sample string");
    }
}
