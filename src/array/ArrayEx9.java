package array;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        int maxProducts = 10;
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;


        while (true) {
            System.out.println("1. 상품 등록, 2. 상품 목록, 3. 종료");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if(choice == 1) {
                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = scanner.nextInt();
                productCount++;
            }

            if (choice ==2) {
                if (productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i <= productCount - 1; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i]);
                }
            }
        }

    }
}
