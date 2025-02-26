package chapter3.generic;

public class GenericBox<T> {
    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    // 일반 메서드
    public void printItem(T item) {
        System.out.println(item);
    }
    // 제네릭 메서드
    public <S> void printBoxItem(S item) {
        System.out.println(item);
    }
}
