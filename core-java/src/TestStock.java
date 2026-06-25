import com.mmcoe.stock.Broker;
import com.mmcoe.stock.Exchange;
import com.mmcoe.stock.Holder;
import com.mmcoe.stock.StockSingleton;

public class TestStock {

    public static void main(String[] args) {

        Holder h = StockSingleton.getStock();
        h.viewData();

        Broker b = StockSingleton.getStock();
        b.getData();

        Exchange x = StockSingleton.getStock();
        x.setData();

        System.out.println(h == b);
        System.out.println(b == x);
    }
}