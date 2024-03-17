package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("더 큰 숫자를 찾아 드립니다.");

        do {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            num1 = scanner.nextInt();

            System.out.print("두번째 숫자를 입력하세요 : ");
            num2 = scanner.nextInt();
            if(num1 == num2) {
                System.out.println("숫자가 동일합니다. 다시 입력해주세요.");
            }
        } while (num1 == num2);

        int sum = (num1 > num2) ? num1 : num2;

        System.out.println("두 숫자중에 더 큰 수는 : " + sum);
    }

    public void typing() {

    }
}
