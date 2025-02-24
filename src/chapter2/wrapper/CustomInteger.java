package chapter2.wrapper;

public class CustomInteger {
    // 속성
    int value;

    // 생성자
    public CustomInteger(int value) {
        this.value = value;
    }

    // 기능
    // toString() 오버라이딩
    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
