import java.util.List;

public class EAndDTaxRule implements Promotion {

  @Override
  public int applyPromotion(List<Product> products, int totalAmount) {
    if (products.contains(Product.E) && products.contains(Product.D)) {
      return (int) Math.ceil(totalAmount * 1.3);
    }
    return totalAmount;
  }

}
