package chapter2.interfaceexample.homeappliances;

public class Computer implements HomeAppliances{
    private boolean power;

    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 켭니다.");
        power = true;
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 종료합니다.");
        power = false;
    }

    public void reset() {
        if (!power) {
            System.out.println("컴퓨터가 켜있을 때만 동작합니다.");
            return;
        }
        turnOff();
        turnOn();
    }
}
