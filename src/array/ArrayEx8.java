package array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요 : ");
        int StudentCount = scanner.nextInt();

        int[][] scores = new int[StudentCount][3];
        String[] subjects = {"국어", "영어", "수학"};



        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요.");

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                int score = scanner.nextInt();
                scanner.nextLine();
                scores[i][j] = score;
            }
        }

        for (int i = 0; i < scores.length; i++){
            int total = 0;
            for(int j = 0; j < scores[0].length;j++) {
                total += scores[i][j];
            }
            double average = (double) total / scores[i].length;
            System.out.println((i + 1) + "번 학생의 총점 : " + total + ", 평균 : " + average);
        }
    }
}
