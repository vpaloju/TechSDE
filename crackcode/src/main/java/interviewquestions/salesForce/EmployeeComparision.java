package interviewquestions.salesForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class EmployeeComparision {

  public static void main(String[] args) {
    ArrayList<Employee> employees = getUnsortedEmployeeList();
    //1. Employee ids in ascending order
    Collections.sort(employees);
    System.out.println(employees);
    //2. Employee ids in reverse order
    Collections.sort(employees, Collections.reverseOrder());
    System.out.println(employees);
  }

  //Returns an unordered list of employees
  private static ArrayList<Employee> getUnsortedEmployeeList() {
    ArrayList<Employee> list = new ArrayList<>();
    Random rand = new Random(10);
    for (int i = 0; i < 5; i++) {
      Employee e = new Employee();
      e.setId(rand.nextInt(100));
      list.add(e);
    }
    return list;
  }

}
