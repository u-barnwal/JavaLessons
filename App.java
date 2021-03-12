class App {

  public static void main(String[] args) {
    System.out.println();
    System.out.println();

    Person p = new Person();

    p.setFirstName("Ram");
    p.setLastName("Kumar");
    p.setAge(11);
    p.setPassword("233");

    System.out.println("First Name: " + p.getFirstName());
    System.out.println("Last Name: " + p.getLastName());
    System.out.println("Age: " + p.getAge());
    System.out.println("Age: " + p.checkPassword("233"));
  }

}