package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min, max;

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

        min = max = arr[0];

        for (int i : arr) {
            min = min >= i ? i : min;
            max = max >= i ? max : i;
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
