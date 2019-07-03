package interviewquestions.strings;

public class ReverseString {

    public static String reverseString(String str){
        char[] charArray=str.toCharArray();
        int start=0,end=charArray.length-1;
        while (start<end){
            charArray[start]^=charArray[end];
            charArray[end]^=charArray[start];
            charArray[start]^=charArray[end];
            start++;
            end--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("abcdefg"));
    }
}
