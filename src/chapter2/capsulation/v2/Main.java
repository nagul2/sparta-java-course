package chapter2.capsulation.v2;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        // 무분별한 세터
//        robot.setLeftLeg(true);
//        robot.setRightLeg(true);
//        robot.setRightArm(true);
//        robot.setLeftArm(true);

        // 의미있는 세터
        robot.walk(true);   // 하나로 로보트의 모든 동작이 on이 됨
    }
}
