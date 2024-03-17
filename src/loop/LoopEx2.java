package loop;

public class LoopEx2 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println("while num : " + num1);
            num1 += 2;
            count++;
        }

        for (int count2 = 1; count2 <= 10; count2++) {
            System.out.println("for num : " + num2);
            num2 += 2;
        }

    }
}
