package chapter3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // for 명령형 스타일: 각 요소 * 10 처리
        ArrayList<Integer> ret1 = new ArrayList<>();
        for (Integer num : arrayList) {
            int multipliedNum = num * 10;
            ret1.add(multipliedNum);
        }
        System.out.println("ret1 = " + ret1);

        // stream 선언형 스타일: 각 요소 * 10 처리
        List<Integer> ret2 = arrayList.stream()     // 데이터 준비 단계 -> 스트림 생성
                .map(num -> num * 10)        // 중간 연산 등록 -> 각 요소를 10배로 변환하는 로직 작성
                .collect(Collectors.toList());      // 최종 연산 -> 리스트로 변환
        System.out.println("ret2 = " + ret2);

        // 1. 익명 클래스를 직접 만들어서 변수에 담아 매개변수로 전달

        Function<Integer, Integer> function = new Function<>() {

            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        };

        List<Integer> ret3 = arrayList.stream().map(function).collect(Collectors.toList());
        System.out.println("ret3 = " + ret3);

        // 2. 람다식을 만들어서 변수에 담아 매개변수로 전달
        Function<Integer, Integer> functionLambda = num -> num * 10;
        List<Integer> ret4 = arrayList.stream().map(functionLambda).collect(Collectors.toList());
        System.out.println("ret4 = " + ret4);

        // 3. 람다식을 직접 매개변수로 전달
        List<Integer> ret5 = arrayList.stream().map(num -> num * 10).collect(Collectors.toList());
        System.out.println("ret5 = " + ret4);

        /**
         * 4. 중간 연산을 함께 사용, filter(), map() -> 실무에서 filter(), map()은 짝꿍처럼 매우 자주 사용됨
         * 요구사항: list에서 짝수를 찾아서 * 10
         * - 1. 짝수 찾기
         * - 2. * 10
         */
        List<Integer> ret6 = arrayList.stream()
                .filter(num -> num % 2 == 0)    // filter()는 조건식을 입력할 수 있음, 조건에 따라 true, false가 반환됨
                .map(num -> num * 10)
                .toList();  // 간결하게 list로 반환할 수 있음
        System.out.println("ret6 = " + ret6);

        // 익명 클래스 활용
        Predicate<Integer> predicate = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        List<Integer> evenNumList1 = arrayList.stream()
                .filter(predicate)
                .map(num -> num * 10)
                .toList();
        System.out.println("evenNumList1 = " + evenNumList1);

        // 람다식을 만들어서 대입
        Predicate<Integer> predicateLambda = integer -> integer % 2 == 0;
        List<Integer> evenNumList2 = arrayList.stream()
                .filter(predicateLambda)
                .map(num -> num * 10)
                .toList();
        System.out.println("evenNumList2 = " + evenNumList2);

        // 람다식을 직점 대입 -> 예제와 같음..
        List<Integer> evenNumList3 = arrayList.stream().filter(integer -> integer % 2 == 0).map(num -> num * 10).toList();
        System.out.println("evenNumList3 = " + evenNumList3);
    }
}
