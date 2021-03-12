public class User {
  private String email, password;

  User() {
    this.email = "test";
    this.password = "123";
  }

  public boolean validate(String email, String password) {
    return this.email == email && this.password == password;
  }
}