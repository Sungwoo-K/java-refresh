package loop;

public class ForEx1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1;; i++) {
            sum += i;
            if(sum > 10) {
                System.out.println("10보다 큰 처음 값 :" + sum);
                break;
            }
        }
    }
}
