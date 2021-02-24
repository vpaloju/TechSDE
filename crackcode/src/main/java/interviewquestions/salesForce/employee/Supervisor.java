package interviewquestions.salesForce.employee;

import java.util.LinkedList;
import java.util.List;

public class Supervisor extends GenericEmployee {
  private List<Employee> supervisee;

  Supervisor(String name, double pay, Gender gender) {
    super(name, pay, gender);
    supervisee = new LinkedList<Employee>();
  }
}
