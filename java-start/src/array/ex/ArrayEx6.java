package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 숫자 갯수를 입력하세요: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int minNumber;
        int maxNumber;
        System.out.println(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        minNumber = maxNumber = numbers[0];
        for (int i = 0; i < n; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("minNumber = " + minNumber);
        System.out.println("maxNumber = " + maxNumber);
    }
}
