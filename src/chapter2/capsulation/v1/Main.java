package chapter2.capsulation.v1;

public class Main {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();
//        dataStore.store = "B";  // 핵폭발 발생 -> private 접근 제어자로 막음
        dataStore.setStore("B");  //
    }
}
