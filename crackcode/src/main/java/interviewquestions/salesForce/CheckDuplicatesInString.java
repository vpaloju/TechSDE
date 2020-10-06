package interviewquestions.salesForce;

public class CheckDuplicatesInString {

    public static boolean isDuplicateChars(String str){
        int[] count = new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
            if(count[str.charAt(i)]>1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isDuplicateChars("Hello world"));
    }
}
