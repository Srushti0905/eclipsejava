public class ShoppingCart {
	private Product[] items;
	private double total;
	private int idx;

	public ShoppingCart() {
		items= new Product[5];
	}
	
	public void addToCart(Product p) {
		if(idx ==items.length)
			System.out.println("Cart full");
		else
			items[idx++]=p;
		    total += p.getPrice();
	}
	
    public void checkout() {
    	for(int i =0;i<idx;i++)
    		System.out.println(items[i]);
        System.out.println("Cart Total:"+ total);    	
	}
}
