public class Vehicle extends Product {

  private float specialTax;
  private float discount;

  Vehicle(String name, float price, float specialTax) {
    super(name, price);
    this.specialTax = specialTax;
  }

  public float getPrice() {
    return (super.getPrice() + specialTax) - discount;
  }

  public void setDiscount(float discount) {
    this.discount = discount;
  }

  public float getDiscount() {
    return discount;
  }

}
