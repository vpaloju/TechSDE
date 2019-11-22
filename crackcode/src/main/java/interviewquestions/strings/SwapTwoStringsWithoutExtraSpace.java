package interviewquestions.strings;

public class SwapTwoStringsWithoutExtraSpace {

    public static void swapStrings(String a,String b){
        System.out.println("Strings before swaping a is: "+a+" and b is: "+b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("Strings After swaping a is: "+a+" and b is: "+b);
    }

    public static void main(String[] args) {
        swapStrings("Love","you");
    }
}
