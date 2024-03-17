package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 5;

        switch (grade) {
            case 1:
                System.out.println("grade 1");
                break;
            case 2:
                System.out.println("grade 2");
                break;
            case 3:
                System.out.println("grade 3");
                break;
            default:
                System.out.println("You don't have grade");
        }
    }
}
