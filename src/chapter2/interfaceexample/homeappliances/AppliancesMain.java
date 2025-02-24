package chapter2.interfaceexample.homeappliances;

public class AppliancesMain {
    public static void main(String[] args) {

        AirConditioning ac = new AirConditioning();
        ac.upTemp();    // 에어컨 먼저 켜야함
        ac.downTemp();  // 에어컨 먼저 켜야함
        ac.turnOn();
        ac.upTemp();
        ac.upTemp();
        ac.upTemp();
        ac.upTemp();
        ac.upTemp();    // 최대 온도 더이상 증가 안됨

        ac.turnOff();   // 종료
        ac.turnOn();    // 다시 킴
        ac.downTemp();
        ac.downTemp();
        ac.downTemp();
        ac.downTemp();
        ac.downTemp();
        ac.downTemp();
        ac.downTemp();  // 최저 온도

        System.out.println("==============================================");

        Tv tv = new Tv();
        tv.upVolume();      // 전원을 켜야함
        tv.downVolume();    // 전원을 켜야함
        tv.turnOn();
        tv.downVolume();
        tv.downVolume();
        tv.downVolume();
        tv.downVolume();    // 최저 볼륨 == 음소거

        tv.turnOff();
        tv.turnOn();

        tv.upVolume();
        tv.upVolume();
        tv.upVolume();  // 최대 볼륨

        System.out.println("==============================================");

        Computer computer = new Computer();

        computer.turnOn();
        computer.reset();
        computer.turnOff();
        computer.reset();   // 꺼있을 땐 안됨
    }
}
