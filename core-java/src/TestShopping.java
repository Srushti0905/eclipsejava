
public class TestShopping {

	
public static void main(String[] args) {
	ShoppingCart cart = new ShoppingCart();
	cart.addToCart(new Product("Marker",25));
	cart.addToCart(new Product("Eraser",12));
	cart.addToCart(new Product("Pencil",15));
	cart.addToCart(new Product("Duster",35));
	cart.addToCart(new Product("Ink",30));
//	cart.addToCart(new Product("Scale",20));



	
	cart.checkout();
}}
//classnaming conevention methodnaming file nameing constantnaming