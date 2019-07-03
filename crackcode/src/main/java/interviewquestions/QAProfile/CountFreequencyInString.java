package interviewquestions.QAProfile;

public class CountFreequencyInString {

    public static int countFreequency(String pat,String txt){
        int m=pat.length();
        int n= txt.length();
        int result=0;
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==m){
                result++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String txt = "dhimanman";
        String pat = "man";
        System.out.println(countFreequency(pat, txt));
    }
}
