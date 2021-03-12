import employee.Person;

public class Student extends Person {

  Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

}