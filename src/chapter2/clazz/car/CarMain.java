package chapter2.clazz.car;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car(1, "김팔도", "Benz S Class", "white", 2025);

        car.carInfo();
        car.accelerate();      // drive 먼저 해야함
        car.deceleration();    // 운행중이 아니면 동작 안함

        car.drive();
        car.accelerate();   // drive 후 1단씩 가속
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();   // speed 5 초과는 안됨

        car.deceleration();
        car.deceleration();
        car.deceleration();
        car.deceleration();
        car.deceleration();
        car.deceleration(); // 차량 멈춤

    }
}
