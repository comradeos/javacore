interface MyInterface {
    public String name = null;
    public Integer age = null;
    public static void showInfo() {}
}

class MyClass implements MyInterface {
    public String name = "Name";
    public Integer age = 123;

}


public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

    }
}