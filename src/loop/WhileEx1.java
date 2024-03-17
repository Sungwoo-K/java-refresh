package loop;

public class WhileEx1 {
    public static void main(String[] args) {
        int sum = 0;
        int add = 1;

        while (add < 4) {
            sum += add++;
        }

        System.out.println(sum);
    }
}
