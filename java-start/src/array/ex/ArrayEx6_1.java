package array.ex;

import java.util.Scanner;

public class ArrayEx6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.print("입력받을 숫자의 갯수를 입력하세요: ");
        int count = sc.nextInt();
        sc.nextLine();
        System.out.println(count + "개의 정수를 입력하세요: ");
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
