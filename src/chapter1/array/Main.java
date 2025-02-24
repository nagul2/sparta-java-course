package chapter1.array;

public class Main {
    public static void main(String[] args) {

        // 모험가 명단..
        String name1 = "gygim";
        String name2 = "Steve";
        String name3 = "Grace";

        String[] adventurerList = {"gygim", "Steve", "Grace"};

        // 1. 배열 선언
        int[] arr;

        // 2. 배열 길이 할당
        arr = new int[5];   // arr = [] [] [] [] []

        // 3. 배열 선언과 길이 동시에 할당
        int[] arr2 = new int[5];    // arr2 = [] [] [] [] []

        // 4. 배열 선언과 동시에 배열의 요소 할당
        int[] arr3 = {10, 20, 30, 40, 50};  // arr2 = [10] [20] [30] [40] [50]
        
        // 배열의 길이
        int arrLength = arr3.length;
        System.out.println("arrLength = " + arrLength);

        // 문자열 배열 선언
        String[] strArr = new String[5];    // [""] [""] [""] [""] [""]

        // 논리형 배열 선언
        boolean[] boolArr = new boolean[3]; // [true] [false] [true]


        // 배열의 요소에 접근: 인덱스 활용 방법
        int[] intArr = {10, 20, 30, 40, 50};
        //              [0] [1] [2] [3] [4]
        System.out.println("배열의 1 번째 요소 접근: " + intArr[0]);
        System.out.println("배열의 2 번째 요소 접근: " + intArr[1]);
        System.out.println("배열의 3 번째 요소 접근: " + intArr[2]);
        System.out.println("배열의 4 번째 요소 접근: " + intArr[3]);
        System.out.println("배열의 5 번째 요소 접근: " + intArr[4]);

        intArr[0] = 100;
        intArr[1] = 200;
        intArr[2] = 300;
        intArr[3] = 400;
        intArr[4] = 500;
        for (int i = 0; i < 5; i++) {
            System.out.println("배열의 " + (i + 1) + " 번째 요소 접근: " + intArr[i]);
        }

        // 배열의 길이를 벗어나서 접근하면 에러 발생, 인덱스 사용시 주의해야함(ArrayIndexOutOfBoundsException)
//        System.out.println(intArr[5]);

        for (int i = 0; i < intArr.length; i++) {
            System.out.println("인덱스: " + i + ", 값: " + intArr[i]);
        }

        // 향상된 for문
        for (int i : intArr) {
            System.out.println("값: " + i);
        }

        boolean[][] board = new boolean[2][2];
        // [] []
        // [] []

        boolean[][] board2 = {
                {true, false},
                {false, true},
        };

        System.out.println(board[0][0]);
        System.out.println(board[0][1]);
        System.out.println(board[1][0]);
        System.out.println(board[1][1]);
    }
}
