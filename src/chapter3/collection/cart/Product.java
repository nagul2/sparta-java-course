package chapter3.collection.cart;

public class Product {
    private String name;
    private long price;
    private int quantity;

    public Product(String name, long price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public long itemCalculation() {
        return price * quantity;
    }


}
