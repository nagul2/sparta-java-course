package chapter2.interfaceexample;

public class SpeedCar implements Car {
    @Override
    public void drive() {
        System.out.println("빠르게 이동합니다.");
    }

    @Override
    public void stop() {
        System.out.println("빠르게 정지합니다.");
    }

    void charge() {
        System.out.println("차량을 충전합니다.");
    }





//    void drive() {
//        System.out.println("빠르게 주행합니다.");
//    }
}


