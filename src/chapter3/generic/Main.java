package chapter3.generic;

public class Main {
    public static void main(String[] args) {

        // 재사용 불가
        Box box1 = new Box(100);
//        new Box("ABC"); // 담을 수 없음
//        new Box(0.1);   // 담을 수 없음

        // 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(100);

        // item을 활용하기 위해서는 다운 캐스팅이 필요함, 다운 캐스팅은 위험(intanceof로 무조건 체크해야 함)
        String item = (String) strBox.getItem();
        System.out.println("item = " + item);

//        String item2 = (String) intBox.getItem();   // 오류 발생, 타입 안정성이 낮음

        // 제네릭 활용
        // 1. 재사용성 보장(타입소거: T -> Object)
        GenericBox<String> strGBox = new GenericBox<>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<>(100);
        GenericBox<Double> doubleGBox = new GenericBox<>(10.5);

        // 타입 안정성 보장(타입소거: 자동으로 다운 캐스팅 삽입)
        String strGBoxItem = strGBox.getItem();
        System.out.println("strGBoxItem = " + strGBoxItem);

        Integer intGBoxItem = intGBox.getItem();
        System.out.println("intGBoxItem = " + intGBoxItem);

        Double doubleGBoxItem = doubleGBox.getItem();
        System.out.println("doubleGBoxItem = " + doubleGBoxItem);

        // 일반 메서드 (String 기준으로 타입 소거가 발생하여, 메서드에 다른 타입을 인자로 넘길 수 없음)
        strGBox.printItem("ABC");
//        strGBox.printItem(100);
//        strGBox.printItem(0.1);

        // 제네릭 메서드(String 과 상관 없음)
        strGBox.printBoxItem("ABC");
        strGBox.printBoxItem(123);
        strGBox.printBoxItem("0.1");
    }
}
