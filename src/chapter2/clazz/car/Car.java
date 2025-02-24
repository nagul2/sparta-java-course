package chapter2.clazz.car;

public class Car {

    private int id;
    private String name;
    private String model;
    private String color;
    private int createYear;
    private int speed;

    boolean driveable;

    public Car(int id, String name, String model, String color, int createYear) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
        this.createYear = createYear;
    }

    void drive() {
        System.out.println("소유주 " + name + "의 " + model + "을 주행합니다.");
        System.out.println();
        driveable = true;
    }

    void accelerate() {
        if (!driveable) {
            System.out.println("주행 버튼을 먼저 눌러주십시오.");
            return;
        }
        if (speed == 5) {
            System.out.println("최대 출력입니다. 현재 출력: " + speed);
            return;
        }

        speed++;
        System.out.println("1단 가속합니다. 현재 출력: " + speed);


    }

    void deceleration() {
        if (!driveable) {
            System.out.println("운행 중이지 않습니다.");
            return;
        }

        if (speed > 0) {
            System.out.println("1단 감속합니다. 현재 출력: " + speed);
            speed--;
        } else {
            System.out.println("차량을 멈춥니다. 현재 출력: " + speed);
        }

    }

    void carInfo() {
        System.out.println("== 차량 정보를 출력합니다. ==");
        System.out.println("시리얼 넘버 = " + id);
        System.out.println("차량 모델 = " + model);
        System.out.println("소유주 = " + name);
        System.out.println("차량 연식 = " + createYear);
        System.out.println();
    }

}
