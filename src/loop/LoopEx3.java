package loop;

public class LoopEx3 {
    public static void main(String[] args) {
        int sum1 = 0;
        int max1 = 5;
        int i1 = 1;

        while(i1 <= max1) {
            sum1 += i1;
            i1++;
        }
        System.out.println("1부터 max까지의 합은 : " + sum1);

        int sum2 = 0;
        int max2 = 3;

        for(int i = 1; i <= max2;i++) {
            sum2 += i;
        }
        System.out.println("1부터 max까지의 합은 : " + sum2);

    }
}
