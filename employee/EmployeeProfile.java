package employee;

public class EmployeeProfile {
  public String firstName, lastName;

  public EmployeeProfile() {
    EmployeeAuth ea = new EmployeeAuth();
    System.out.println(ea.email);
  }

}
