import java.util.List;

public class BuyTwoAGetOneCHalfPrice implements Promotion {
  @Override
  public int applyPromotion(List<Product> products, int totalAmount) {
    int countA = (int) products.stream().filter(p -> p == Product.A).count();
    int countC = (int) products.stream().filter(p -> p == Product.C).count();
    if (countA > 1 && (countA / 2) <= countC) {
      return totalAmount - countA / 2 * (Product.C.getPrice() / 2);
    }
    return totalAmount;
  }

}
