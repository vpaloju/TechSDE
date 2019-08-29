package interviewquestions.adp;

import java.util.*;

/**
 * Sort employee data with fields.
 */
public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Sreekanth", 1000000);
        Employee e2 = new Employee(300, "Arun", 9900000);
        Employee e3 = new Employee(200, "Ramana", 9000000);
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        for (Employee e : employeeList) {
            System.out.println("Employee details before Sort");
            System.out.println("**********Employeedetails:**********");
            System.out.println("id:"+e.id+","+"name: "+e.name+","+"salary: "+e.salary);
        }
        Collections.sort(employeeList);
        for (Employee e : employeeList) {
            System.out.println("Employee details After sort");
            System.out.println("**********Employeedetails:**********");
            System.out.println("id:"+e.id+","+"name: "+e.name+","+"salary: "+e.salary);
        }
    }

    /*@Override
    public int compareTo(Employee employee) {
        return this.id-employee.id;
    }*/

    /*@Override
    public int compareTo(Employee employee) {
        return (this.name).compareTo(employee.name);
    }*/

    @Override
    public int compareTo(Employee employee) {
        return (int) (this.salary-employee.salary);
    }

}

