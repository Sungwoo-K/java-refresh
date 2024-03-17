package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[][] students = new int[5][3];
        int i = 1;

        for(int row = 0; row < students.length; row++) {
            for(int column = 0; column < students[row].length; column++) {
                students[row][column] = i++;
            }
        }


        for(int row = 0; row < students.length; row++) {
            for(int column = 0; column < students[row].length; column++) {
                System.out.print(students[row][column] + " ");
            }
            System.out.println();
        }
    }
}
