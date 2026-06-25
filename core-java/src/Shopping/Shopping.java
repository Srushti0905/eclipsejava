package Shopping;

public interface Shopping {

    void addToCart(Product p) throws CartException;

    void checkout() throws CartException;
}