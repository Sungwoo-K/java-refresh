package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int size = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[size];

        System.out.println(size + "개의 정수를 입력하세요 :");

        for (int i = 0; i < arr.length; i++) {
            int num = scanner.nextInt();
            scanner.nextLine();
            arr[i] = num;
        }


        for (int i : arr) {
            sum += i;
        }

        double average = (double) sum / arr.length;

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);

    }
}
