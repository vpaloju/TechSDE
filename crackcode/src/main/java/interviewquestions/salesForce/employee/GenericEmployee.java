package interviewquestions.salesForce.employee;

public abstract class GenericEmployee implements Employee {

  protected String name;
  protected double pay;
  protected Gender gender;

  GenericEmployee(String name, double pay, Gender gender) {
    this.name = name;
    this.pay = pay;
    this.gender = gender;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public Gender getGender() {
    return null;
  }

  @Override
  public double getAnnualPay() {
    return 0;
  }
}
