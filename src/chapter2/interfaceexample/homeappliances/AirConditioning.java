package chapter2.interfaceexample.homeappliances;

public class AirConditioning implements HomeAppliances{

    private int temp;
    private boolean power;

    public AirConditioning() {
        this.temp = 24; // 기본 온도 24도
    }

    @Override
    public void turnOn() {
        System.out.println("에어컨을 켭니다");
        power = true;
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨을 끕니다");
        temp = 24;  // 에어콘 꺼지면 기본 온도로 돌아감
        power = false;
    }

    public void upTemp() {
        if (!power) {
            System.out.println("전원을 먼저 켜주세요");
            return;
        }

        if (temp >= 28) {
            System.out.println("최대 온도는 28도 입니다. 현재 온도: " + temp);
            return;
        }

        temp++;
        System.out.println("현재 온도: " + temp);
    }

    public void downTemp() {
        if (!power) {
            System.out.println("전원을 먼저 켜주세요");
            return;
        }

        if (temp <= 18) {
            System.out.println("최저 온도는 18도 입니다. 현재온도: " + temp);
            return;
        }

        temp--;
        System.out.println("현재 온도: " + temp);
    }
}
