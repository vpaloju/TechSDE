package interviewquestions.salesForce;

public class Employee implements Comparable<Employee> {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + "]";
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId().compareTo(o.getId());
    }
}