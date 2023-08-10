public class Main {

  public static void main(String[] args) {
    Shop shop = new Shop();
    ShoppingCart shoppingCart = new ShoppingCart(args, shop);
    System.out.println("The following products are in your cart: " + shoppingCart.getCartItems());
    System.out.println("The amount to be paid: " + shop.payment(args) + " Ft");

  }

}
