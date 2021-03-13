public class Device extends Product {

  private float surcharge;

  Device(String name, float price, float surcharge) {
    super(name, price);
    this.surcharge = surcharge;
  }

  public float getPrice() {
    return super.getPrice() + surcharge;
  }

}
