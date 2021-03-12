package employee;

public class EmployeeAuth {
  String email;
  private String password;

  public EmployeeAuth() {
    this.email = "employee@company.com";
    this.password = "123";
  }

  public boolean validate(String email, String password) {
    return this.email == email && this.password == password;
  }
}
