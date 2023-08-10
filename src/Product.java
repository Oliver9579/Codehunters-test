public enum Product {

  A(55),
  B(20),
  C(60),
  D(10),
  E(45);

  private Integer price;

  Product(int price) {
    this.price = price;
  }

  public Integer getPrice() {
    return price;
  }

}
