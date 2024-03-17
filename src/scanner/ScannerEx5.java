package scanner;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("같은 숫자를 입력하셨습니다.");
            return;
        }

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수:");
        for (int i = num1; i <= num2;i++){
            System.out.print(i);
            if(num2 == i) {
                break;
            }
            System.out.print(", ");
        }
    }
}
