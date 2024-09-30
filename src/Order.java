public class Order {
    private String dishName;
    private int tableNr;
    private double price;

    public Order(String dishName, int tableNr, double price){
        this.dishName=dishName;
        this.tableNr=tableNr;
        this.price=price;
    }

    public String getDishName() {
        return dishName;
    }

    public int getTableNr() {
        return tableNr;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "dishName='" + dishName + '\'' +
                ", tableNr=" + tableNr +
                ", price=" + price +
                '}';
    }
}
