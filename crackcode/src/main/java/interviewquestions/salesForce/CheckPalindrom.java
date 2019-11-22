package interviewquestions.salesForce;

import interviewquestions.ReverseNumber;

public class CheckPalindrom {

    public static boolean isPalindromNumber(int num){
        if(ReverseNumber.reverseNumber(num)==num){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPalindrom(char[] str, int start, int end) {
        for (int i = start; i <= (start + end) / 2; i++) {
            if (str[i] == str[start + end - i])
                continue;
            else
                return false;
        }
        return true;
    }

}
