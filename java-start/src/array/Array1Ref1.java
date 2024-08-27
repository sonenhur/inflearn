package array;

import java.util.Arrays;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // int 다섯개 들어가는 students라는 배열 생성

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 참조값을 실제로 확인해보려면
        System.out.println(students);
        // 배열 내용을 확인하려면
        System.out.println(Arrays.toString(students));

        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}