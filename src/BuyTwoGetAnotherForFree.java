import java.util.List;

public class BuyTwoGetAnotherForFree implements Promotion {

  @Override
  public int applyPromotion(List<Product> products, int totalAmount) {
    int countD = (int) products.stream().filter(p -> p == Product.D).count();
    if (countD >= 3) {
      return totalAmount - countD / 3 * (Product.D.getPrice());
    }
    return totalAmount;
  }

}
