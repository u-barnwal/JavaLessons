public class Rectangle extends Shape {

  public float perimeter() {
    return 2 * (length + breadth);
  }

  public float area() {
    return length * breadth;
  }
}
