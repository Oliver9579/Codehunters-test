import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  private List<Product> cartItems;

  public ShoppingCart(String[] cart, Shop shop) {
    ArrayList<Product> shoppingCart = new ArrayList<>();

    for (String product : cart) {
      for (int i = 0; i < shop.getAllProducts().size(); i++) {
        if (shop.getAllProducts().get(i).toString().equals(product)) {
          shoppingCart.add(shop.getAllProducts().get(i));
        }
      }
    }
    cartItems = shoppingCart;
  }

  public List<Product> getCartItems() {
    return cartItems;
  }

  public int getShoppingCartPrice() {
    return cartItems.stream().mapToInt(Product::getPrice).sum();
  }

}
