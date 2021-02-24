package interviewquestions.salesForce;

/**
 * This is a famous interview question asked in Google, Paytm and many other company interviews.
 * <p>
 * Below is the problem statement.
 * Imagine you have a special keyboard with the following keys:
 * Key 1:  Prints 'A' on screen
 * Key 2: (Ctrl-A): Select screen
 * Key 3: (Ctrl-C): Copy selection to buffer
 * Key 4: (Ctrl-V): Print buffer on screen appending it
 * after what has already been printed.
 * <p>
 * If you can only press the keyboard for N times (with the above four
 * keys), write a program to produce maximum numbers of A's. That is to
 * say, the input parameter is N (No. of keys that you can press), the
 * output is M (No. of As that you can produce).
 * Examples:
 * <p>
 * Input:  N = 3
 * Output: 3
 * We can at most get 3 A's on screen by pressing
 * following key sequence.
 * A, A, A
 * <p>
 * Input:  N = 7
 * Output: 9
 * We can at most get 9 A's on screen by pressing
 * following key sequence.
 * A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V
 * <p>
 * Input:  N = 11
 * Output: 27
 * We can at most get 27 A's on screen by pressing
 * following key sequence.
 * A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V, Ctrl A,
 * Ctrl C, Ctrl V, Ctrl V
 */
public class PrintMaxNumberOfAs {

  public static int printMaxAs(int N) {
    // The optimal string length is N when N is smaller than 7
    if (N <= 6)
      return N;
    // An array to store result of sub problems
    int[] screen = new int[N];
    // Initializing the optimal lengths array for up til 6 input strokes.
    int n;
    for (n = 1; n <= 6; n++)
      screen[n - 1] = n;
    // Solve all subproblems in bottom-up manner
    for (n = 7; n <= N; n++) {
      // for any keystroke n, we will need to choose between:-
      // 1. pressing Ctrl-V once after copying the A's obtained by n-3 keystrokes.
      // 2. pressing Ctrl-V twice after copying the A's obtained by n-4 keystrokes.
      // 3. pressing Ctrl-V thrice after copying the A's obtained by n-5 keystrokes.
      screen[n - 1] = Math.max(2 * screen[n - 4],
        Math.max(3 * screen[n - 5],
          4 * screen[n - 6]));
    }
    return screen[N - 1];
  }

  public static void main(String[] args) {
    System.out.println(printMaxAs(10));
  }
}
