package Shopping;

public class TestShopping {

    public static void main(String[] args) {

        Shopping cart = CartFactory.newCart();

        try {

            cart.addToCart(new Product("Marker", 25));
            cart.addToCart(new Product("Eraser", 12));
            cart.addToCart(new Product("Pencil", 15));
            cart.addToCart(new Product("Duster", 35));
            cart.addToCart(new Product("Ink", 30));

            cart.checkout();

        } catch (CartException e) {

            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}