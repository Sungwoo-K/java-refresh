package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        switch (grade) {
            case 1 -> System.out.println("grade 1");
            case 2 -> System.out.println("grade 2");
            case 3 -> System.out.println("grade 3");
            default -> System.out.println("You don't have grade");
        }
    }
}
