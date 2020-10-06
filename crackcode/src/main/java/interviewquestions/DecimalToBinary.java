package interviewquestions;

public class DecimalToBinary {

    public static String decimalToBinary(int num){
        StringBuilder result= new StringBuilder();
        while(num>0){
            result.insert(0,num%2);
            num/=2;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(5));
        System.out.println(decimalToBinary(9));
    }
}
