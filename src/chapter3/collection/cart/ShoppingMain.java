package chapter3.collection.cart;

public class ShoppingMain {
    public static void main(String[] args) {

        Product apple = new Product("사과", 3000, 5);
        Product peach = new Product("복숭아", 2500, 3);
        Product watermelon = new Product("수박", 30000, 2);

        Cart cart = new Cart();
        cart.addProduct(apple);
        cart.addProduct(peach);
        cart.addProduct(watermelon);
        cart.printCart();
        cart.printCart();
        cart.removeProduct(apple);

        long totalPrice = cart.calculateTotalPrice();
        System.out.println("최종 결제 금액 = " + totalPrice);

    }


}
