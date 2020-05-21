package th.ac.mahidol.ict.conversion;

import java.util.Date;
import java.util.List;

public class Order {
    private long oderNumber;
    private Date date;
    private double subTotal;
    private double tax;
    private double shipping;
    private double total;
    private Customer customer;
    private State state;
    private List<ProductOrder> productOrders;
}
