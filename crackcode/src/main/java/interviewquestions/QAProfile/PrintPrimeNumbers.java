package interviewquestions.QAProfile;

import interviewquestions.PrimeNumber;

public class PrintPrimeNumbers {

    public static void printPrimeNumbers(int count) {
        int counter=0;
        for (int i = 2; i <= count; i++) {
            if(PrimeNumber.isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        printPrimeNumbers(100);
    }
}
