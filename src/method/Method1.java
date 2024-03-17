package method;

public class Method1 {
    public static void main(String[] args) {
        Method1 cal = new Method1();
        int sum = cal.calculator(3,5);
        System.out.println(sum);
    }

    public int calculator(int a , int b) {
        return a + b;
    }
}
