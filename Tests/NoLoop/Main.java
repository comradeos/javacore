package Tests.NoLoop;

public class Main {
    public static void main(String[] args) {
        String name = "Iaroslav";
        String str = "xx";
        str = str.replaceAll("x", "xx");
        str = str.replaceAll("x", "xx");
        str = str.replaceAll("x", name + "\n");
        System.out.println(str);
    }
}