package chapter1.array;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.print("누적합: " + sum);
    }
}
