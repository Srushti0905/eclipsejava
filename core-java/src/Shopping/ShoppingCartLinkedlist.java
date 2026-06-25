package Shopping;

import com.mmcoe.ds.LinkedList;

public class ShoppingCartLinkedlist implements Shopping {

    private LinkedList<Product> items;
    private double total;
//    private int idx;

    public ShoppingCartLinkedlist() {
        items = new LinkedList<Product>();
    }

    @Override
    public void addToCart(Product p) throws CartException {

        if (items.getSize() ==5)
            throw new CartException("Cart Full");

        items.add(p );
        total += p.getPrice();
    }

    @Override
    public void checkout( ) throws CartException {
    	if (items.getSize() ==5)
    	  throw new CartException ("Empty cart");
       
    	items.print();
    	System.out.println("Cart Total"+ total);
    }
}