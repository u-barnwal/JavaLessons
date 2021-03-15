class App {

  public static void main(String[] args) {
    System.out.println();
    System.out.println();

    // final int i = 10;

    // System.out.println(i);

    Test t1 = new Test();
    t1.name = "AA";

    Test t2 = new Test();
    t2.name = "AB";

    Test.setBrand("ASUS");

    System.out.println(t1.name);
    System.out.println(t2.name);
    System.out.println(Test.getBrand());
  }

}