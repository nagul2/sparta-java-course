package chapter2.wrapper;

public class MyDouble {

    private final double value; // 원래 래퍼클래스는 불변임

    public MyDouble(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }

    public double getValue() {
        return value;
    }

    public MyDouble addDouble(MyDouble value) {
        return new MyDouble(this.value + value.value);
    }
}
