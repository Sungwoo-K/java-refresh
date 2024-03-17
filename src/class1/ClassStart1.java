package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "김";
        student1.age = 3;
        student1.grade = 5;

        Student student2 = student1;

        student1.age = 5;
        System.out.println(student1.age);
        System.out.println(student2.age);
    }
}
