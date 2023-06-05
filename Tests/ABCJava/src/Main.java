interface MyInterface {
    public String name = null;
    public Integer age = null;
    public void showInfo();
}

class MyClass implements MyInterface {
    public String name = "Name";
    public Integer age = 123;
    public void showInfo() {}
}


public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
    }
}