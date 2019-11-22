package interviewquestions;

public class LargestOf3Numbers {

    public static int largestNumber(int a,int b,int c){
        int largest = a>b?a:b;
        return c>largest?c:largest;
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(30,5,2));
    }
}

