interface MyInterface {
    public static String name = null;
    public static Integer age = null;

    public static void showInfo()
    {
        System.out.println(name + age);
    }
}

class MyClass implements MyInterface {
    public static String name = "Name";
    public static Integer age = 123;
}


public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}