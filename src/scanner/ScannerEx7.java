package scanner;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int inputNum = scanner.nextInt();
            scanner.nextLine();

            if(inputNum == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if(inputNum == 1) {
                System.out.print("상품명을 입력하세요 : ");
                String productName = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요 : ");
                int productPrice = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요 : ");
                int productQauntity = scanner.nextInt();
                int totalPrice = productPrice * productQauntity;
                System.out.println("상품명: " +productName+ " 가격:" + productPrice + " 수량: " + productQauntity + " 합계:" + totalPrice + "원");
                sum += totalPrice;
            }

            if (inputNum == 2) {
                System.out.println("총 비용 : " + sum + "원");
            }
        }
    }
}
