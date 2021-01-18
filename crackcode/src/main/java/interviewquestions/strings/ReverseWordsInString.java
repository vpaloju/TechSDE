package interviewquestions.strings;

public class ReverseWordsInString {

    public static String reverseWordsInString(String str){
        String reversedWordsString="";
        String[] temp = str.split(" ");
        for (int i=temp.length-1;i>=0;i--){
            reversedWordsString+=temp[i]+" ";
        }
        return reversedWordsString;
    }

    public static void main(String[] args) {
        System.out.println(reverseWordsInString("Hello World welcome to java"));
    }
}
