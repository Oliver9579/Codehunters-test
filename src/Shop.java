import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {

  private List<Product> products;
  private List<Promotion> promotions;

  public Shop() {
    products = new ArrayList<>(Arrays.asList(Product.values()));
    promotions = new ArrayList<>(Arrays.asList(
            new BuyTwoAGetOneCHalfPrice(),
            new BuyTwoGetAnotherForFree(),
            new EAndDTaxRule()));
  }

  public List<Product> getAllProducts() {
    return products;
  }

  public int payment(String[] cartProducts) {
    ShoppingCart shoppingCart = new ShoppingCart(cartProducts, this);
    int totalAmount = shoppingCart.getShoppingCartPrice();
    for (Promotion promotion : promotions) {
      totalAmount = promotion.applyPromotion(shoppingCart.getCartItems(), totalAmount);
    }
    return totalAmount;
  }

}
