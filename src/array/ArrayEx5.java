package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
        double average = (double) sum / arr.length;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j : arr) {
            sum += j;
        }

        System.out.println("입력한 정수의 합계" + sum);
        System.out.println("입력한 정수의 평균" + average);

    }
}
