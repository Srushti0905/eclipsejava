//package Shopping;
//
//public final class CartFactory {
//
//    public static ShoppingCart newCart() {
//        return new ShoppingCart();
//    }
//}

package Shopping;

public final class CartFactory {

    public static Shopping newCart() {
        return new ShoppingCartLinkedlist();
    }
}