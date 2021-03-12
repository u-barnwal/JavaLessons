public class Person {
  private String firstName, lastName, password;
  private int age;

  public void setPassword(String password) {
    // check if eligible to change password

    this.password = password;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setAge(int age) {
    if (age > 0)
      this.age = age;
    else
      System.out.println("Please enter a valid age!");
  }

  public int getAge() {
    return age;
  }

  public boolean checkPassword(String password) {
    return this.password == password;
  }

}
