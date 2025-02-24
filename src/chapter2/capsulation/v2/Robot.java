package chapter2.capsulation.v2;

// 로보트를 걷게 만들기
public class Robot {

    private boolean leftLeg;
    private boolean rightLeg;

    private boolean leftArm;
    private boolean rightArm;

    // ... 다양한 속성이 수십개 생성..
    // 모든 속성만큼 세터가 필요하게 되고, 실제 사용할 때 너무 복잡하게 세터를 불러와야함 -> 이것도 무분별한 세터

//    public void setLeftLeg(boolean leftLeg) {
//        this.leftLeg = leftLeg;
//    }
//
//    public void setRightLeg(boolean rightLeg) {
//        this.rightLeg = rightLeg;
//    }
//
//    public void setLeftArm(boolean leftArm) {
//        this.leftArm = leftArm;
//    }
//
//    public void setRightArm(boolean rightArm) {
//        this.rightArm = rightArm;
//    }

    // 의미있는 세터 -> 메서드로 동작
    public void walk(boolean power) {
        this.leftLeg = power;
        this.rightLeg = power;
        this.leftArm = power;
        this.rightArm = power;
    }
}
