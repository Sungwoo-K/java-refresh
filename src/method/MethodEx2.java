package method;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello world";

        speak(message, 5);

    }

    public static  void  speak(String str, int time) {
        for(int i = 0; i < time; i++) {
            System.out.println(str);
        }
    }
}
