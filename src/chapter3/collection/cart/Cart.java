package chapter3.collection.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        System.out.println("상품 추가: " + product.getName() + ", 수량: "+ product.getQuantity());
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        if (products.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        System.out.println("장바구니 제거: " + product.getName());
        this.products.remove(product);
    }


    public void printCart() {
        System.out.print("장바구니 목록 출력:");
        for (Product product : products) {
            System.out.print(" [" + product.getName() + "] 수량 = " + product.getQuantity() + "개 가격 = " + product.itemCalculation() + "원");
        }
        System.out.println();
    }

    public long calculateTotalPrice() {
        int totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.itemCalculation();
        }
        return totalPrice;
    }
}
