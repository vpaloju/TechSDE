package interviewquestions.strings;

public class SwapFirstAndLastCharactersOfWord {
    static String res="";
    public static String swapFirstAndLastCharactersOfWord(String str){
        char[] charArray= str.toCharArray();
        for(int i=0;i<charArray.length;i++){
            int k=i;
            while (i<charArray.length&&charArray[i]!=' '){
                i++;
            }
            char temp=charArray[k];
            charArray[k]=charArray[i-1];
            charArray[i-1]=temp;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
     System.out.println(swapFirstAndLastCharactersOfWord("geeks for geeks"));
    }
}
