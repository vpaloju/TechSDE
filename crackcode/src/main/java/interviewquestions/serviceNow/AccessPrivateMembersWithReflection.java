package interviewquestions.serviceNow;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessPrivateMembersWithReflection {
  private String privateString = null;

  public AccessPrivateMembersWithReflection(String privateString) {
    this.privateString = privateString;
  }

  private String getPrivateString() {
    return this.privateString;
  }

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    AccessPrivateMembersWithReflection privateObject = new AccessPrivateMembersWithReflection("The private value");
    //Accessing Fields
    Field privateStringField = AccessPrivateMembersWithReflection.class.getDeclaredField("privateString");
    privateStringField.setAccessible(true);
    String fieldValue = (String) privateStringField.get(privateObject);
    System.out.println("fieldValue = " + fieldValue);

    //Accessing Methods
    Method privateStringMethod = AccessPrivateMembersWithReflection.class.getDeclaredMethod("getPrivateString", null);
    privateStringMethod.setAccessible(true);
    String returnValue = (String) privateStringMethod.invoke(privateObject, null);
    System.out.println("returnValue = " + returnValue);
  }
}
