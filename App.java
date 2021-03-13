class App {

  public static void main(String[] args) {
    System.out.println();
    System.out.println();

    Square s = new Square();
    s.length = 5;
    s.breadth = 5;

    System.out.println("---Square---");
    System.out.println(s.perimeter());

    Rectangle r = new Rectangle();
    r.length = 5;
    r.breadth = 10;

    System.out.println("---Rectangle---");
    System.out.println(r.perimeter());

    // Shape sh = new Shape();
  }

}