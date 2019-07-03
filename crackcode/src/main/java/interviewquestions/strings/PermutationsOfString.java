package interviewquestions.strings;

public class PermutationsOfString {

    public static void permute(String str,int start,int end){
        if(start==end){
            System.out.println(str);
        }else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                permute(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }

    public static String swap(String str,int i,int j){
        char[] charArray=str.toCharArray();
        char temp = charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }
}
