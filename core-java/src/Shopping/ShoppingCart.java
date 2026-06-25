package Shopping;

public class ShoppingCart implements Shopping {

    private Product[] items;
    private double total;
    private int idx;

    public ShoppingCart() {
        items = new Product[5];
    }

    @Override
    public void addToCart(Product p) throws CartException {

        if (idx == items.length)
            throw new CartException("Cart Full");

        items[idx++] = p;
        total += p.getPrice();
    }

    @Override
    public void checkout( ) throws CartException {
      if (idx ==0)
    	  throw new CartException ("Empty cart");
       for (int i = 0; i < idx; i++)
            System.out.println(items[i]);

        System.out.println("Cart Total: " + total);
    }
}