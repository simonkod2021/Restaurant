public class Main {
    public static void main(String[] args) {
        Order order_1 = new Order("pannkaka",50,500);

        Order order_2 = new Order("Köttbullar",25,300);

        Restaurant restaurant = new Restaurant();
        System.out.println("Dishname is "+order_1.getDishName());
        System.out.println("Table number is "+order_1.getTableNr());
        System.out.println("Price is "+order_1.getPrice());
        restaurant.addOrder(order_1);
        System.out.println("-------------------------------------");
        System.out.println("Dishname is "+order_2.getDishName());
        System.out.println("Table number is "+order_2.getTableNr());
        System.out.println("Price is "+order_2.getPrice());
        restaurant.addOrder(order_2);
        System.out.println("-------------------------------------");
        restaurant.displayOrders();
        System.out.println("-------------------------------------");
        restaurant.calculateTotal();


    }
}