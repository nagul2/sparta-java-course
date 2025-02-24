package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        // 객체 생성(인스턴스화)
        /**
         * --- personA ---
         * - name = "gygim"
         * - age = 20
         * - address = XXXX
         */
        Person personA = new Person("gygim", 20);
        Person personB = new Person("Steve", 15);

/*
        // 속성에 직접 접근
        System.out.println("설정전 personA 이름: " + personA.name);  // null
        System.out.println("설정전 personB 이름: " + personB.name);  // null
        personA.name = "gygim";
        personB.name = "Steve";
        System.out.println("설정 후 personA 이름: " + personA.name); // gygim
        System.out.println("설정 후 personB 이름: " + personB.name); // Steve
*/


        // 기능 활용
        int sum1 = personA.sum(1, 2);
        int sum2 = personB.sum(2, 4);
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);


        String name = personB.getName();
        System.out.println("name = " + name);
        System.out.println("personA의 주소: " + personA.address);  // null
        personA.setAddress("서울");
        System.out.println("personA의 주소: " + personA.address);  // 서울
    }
}
