package th.ac.mahidol.ict.conversion;

import java.util.List;

public class State {
    private String state;
    private float taxRate;
    private List<Order> orders;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
