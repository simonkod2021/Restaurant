import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Order> orders;

    public Restaurant() {
        this.orders = new ArrayList<>();
    }
    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Added "+order+" to the list");
    }
    public void calculateTotal(){
        for (Order order : orders){
            double price = order.getPrice();
            System.out.println("Total price is: "+price);
        }
    }
    public void displayOrders(){
        for(Order order : orders){
            System.out.println(order);
        }
    }
}
