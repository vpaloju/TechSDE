package interviewquestions.strings;

public class CountWords {

    public static int wordCount(String str){
        char[] a = str.toCharArray();
        int wordCount=0;
        for(int i=0;i<a.length;i++){
            if( ((i>0)&&(a[i]!=' ')&&(a[i-1]==' ')) || ((a[0]!=' ')&&(i==0)) ){
                wordCount++;
            }
        }
        return wordCount;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("    India Is My Country"));
    }
}
