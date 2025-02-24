package chapter2.capsulation.v1;

// 핵시설 관리하는 개발자
public class DataStore {
    // "B" 문자열 하나만 입력되면 핵폭발 발생..!
    private String store;   // private 제어자 설정

    // 값을 사용할 수 있게 세터를 생성, 이렇게 사용하면 B가 들올 수 있으므로 핵폭발 발생
    // 즉, 무분별한 세터가되어 private 접근 제어자를 사용하는 의미가 없어짐
//    public void setStore(String store) {
//        this.store = store;
//    }

    // 의미있는 로직을 입력하여 안전한 세터를 사용
    public void setStore(String store) {
        if (store.equals("B")) {
            System.out.println("B가 입력되면 안됩니다.");
            return;
        }
        this.store = store;
    }
}
