import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}