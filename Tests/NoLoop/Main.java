package Tests.NoLoop;

public class Main {
    public static void main(String[] args) {
        String name = "Iaroslav";
        String str = "xxxxxxxxxx";
        str = str.replaceAll("x", "xxxxxxxxxx");
        str = str.replaceAll("x", "xxxxxxxxxx");
        str = str.replaceAll("x", name + "\n");
        System.out.println(str);
    }
}

// print your name 1000 times using no loops