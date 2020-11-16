package interviewquestions.serviceNow;

import java.util.regex.Pattern;

public class ValidateEmailAddress {

  public static boolean isValidEmailAddress(String email) {
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    //String emailRegex = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,6}";
    Pattern pattern = Pattern.compile(emailRegex);
    if (email == null)
      return false;
    return pattern.matcher(email).matches();
  }

  public static void main(String[] args) {
    String validEmail = "contribute@geeksforgeeks.org";
    String invalidEmail = "contribute@geeksforgeeks..org";
    if (isValidEmailAddress(validEmail))
      System.out.println("Yes");
    else
      System.out.print("No");
    if (isValidEmailAddress(invalidEmail))
      System.out.print("Yes");
    else
      System.out.println("No");
  }
}
