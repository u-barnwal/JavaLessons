class App {

  public static void main(String[] args) {
    System.out.println();
    System.out.println();

    Product p = new Product("Lux", 10);

    System.out.println("---Product---");
    System.out.println(p.getName());
    System.out.println(p.getPrice());

    Vehicle v = new Vehicle("Car", 10000, 200);

    v.setDiscount(100);

    System.out.println("---Vehicle---");
    System.out.println(v.getName());
    System.out.println(v.getPrice());

    Device d = new Device("Laptop", 40000, 2000);

    System.out.println("---Device---");
    System.out.println(d.getName());
    System.out.println(d.getPrice());
  }

}