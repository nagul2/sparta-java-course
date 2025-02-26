package chapter3.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 배열의 한계(정적)
        // 선언과 동시에 길이를 설정해야 함
        int[] numbers = new int[3];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // 배열의 정적인 특징의 한계
//        numbers[3] = 40;    // 에러 발생

        // 컬렉션
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 원하는 만큼 데이터를 입력할 수 있음
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // ArrayList 활용
        ArrayList<String> names = new ArrayList<>();

        // 데이터 추가
        names.add("Spartan");
        names.add("Steve");
        names.add("Isac");
//        names.add(1);   // 다른 타입은 입력 불가능
        names.add("1");
        names.add("2");

        // 순서 보장
        System.out.println("names = " + names);

        // 중복 데이터 허용
        names.add("Spartan");
        System.out.println("names = " + names);

        // 데이터 단건 조회
        String name1 = names.get(0);    // 인자에 index 번호를 입력
        System.out.println("name1 = " + name1);

        // 데이터 삭제
        names.remove("Steve");
        System.out.println("names = " + names);

        // HashSet 사용 방법
        HashSet<String> uniqueNames = new HashSet<String>();
        uniqueNames.add("Spartan");
        uniqueNames.add("Steve");
        uniqueNames.add("Isac");
        uniqueNames.add("1");
        uniqueNames.add("2");

        // 순서를 보장 하지 않음
        System.out.println("uniqueNames = " + uniqueNames);

        // get() 활용 불가, 인덱스 활용 불가
//        uniqueNames.get();

        // 중복 데이터 불가
        uniqueNames.add("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

        // 데이터 제거
        uniqueNames.remove("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

        // HashMap 활용
        // <키(""), 값(0)>
        HashMap<String, Integer> memberMap = new HashMap<>();

        // 데이터 저장
        memberMap.put("Spartan", 20);
        memberMap.put("Steve", 30);
        memberMap.put("Isac", 40);
        memberMap.put("John", 50);
        memberMap.put("Alice", 10);

        // 순서 보장 X
        System.out.println("memberMap = " + memberMap);

        // 키 중복 불가, 값에 덮어쓰기가 발생함
        memberMap.put("Alice", 25);
        System.out.println("memberMap = " + memberMap);

        // 단건 조회 -> 키로 접근, 값을 반환
        Integer spartanNum = memberMap.get("Spartan");
        System.out.println("spartanNum = " + spartanNum);

        // 삭제
        memberMap.remove("Spartan");
        System.out.println("memberMap = " + memberMap);

        // 키 확인 -> 셋으로 반환
        Set<String> keySet = memberMap.keySet();
        System.out.println("keySet = " + keySet);

        // 값 확인 -> 콜렉션으로 반환
        Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);
    }
}
