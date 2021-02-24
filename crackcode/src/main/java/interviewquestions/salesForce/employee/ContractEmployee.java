package interviewquestions.salesForce.employee;

import java.time.DateTimeException;
import java.time.LocalDate;

public class ContractEmployee extends NonManagerEmployee {
  private LocalDate contractEndDate;

  public ContractEmployee(String name, double pay, Gender gender, int date, int
    month, int year) throws IllegalArgumentException {
    super(name, pay, gender);
    //validate our date
    try {
      contractEndDate = LocalDate.of(year, month, date);
    } catch (DateTimeException e) {
      throw new IllegalArgumentException("Invalid contract end date");
    }
  }
}
