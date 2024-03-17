package method;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        calculator(a,b,c);

        int x = 15;
        int y = 25;
        int z = 35;

        calculator(x,y,z);
    }

    public static void calculator(int x, int y, int z) {
        int sum = x + y + z;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
    }
}
