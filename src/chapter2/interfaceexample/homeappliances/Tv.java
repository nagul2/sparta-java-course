package chapter2.interfaceexample.homeappliances;

public class Tv implements HomeAppliances {
    private int volume = 3; // 기본 볼륨 3
    private boolean power;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
        power = true;
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
        volume = 3; // 끄면 기본 볼륨으로 복귀
        power = false;
    }

    public void upVolume() {
        if (!power) {
            System.out.println("전원을 먼저 켜주세요");
            return;
        }

        if (volume < 5) {
            volume++;
            System.out.println("현재 볼륨: " + volume);
        } else if (volume == 5) {
            System.out.println("최대 볼륨 입니다. 현재 볼륨: " + volume);
        }

    }

    public void downVolume() {
        if (!power) {
            System.out.println("전원을 먼저 켜주세요");
            return;
        }

        volume--;

        if (volume < 0) {
            System.out.println("현재 음소거 상태 입니다.");

        } else if (volume == 0) {
            System.out.println("음소거 모드에 진입 합니다. 현재 볼륨: " + volume);

        } else {
            System.out.println("현재 볼륨: " + volume);
        }


    }
}
