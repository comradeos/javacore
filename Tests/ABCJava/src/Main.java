interface MyInterface {
    public String name = null;
    public Integer age = null;
    public void showInfo();
}

class MyClass implements MyInterface {
    public String name = "Iaroslav";
    public Integer age = 33;
    public void showInfo() {
        String message = String.format("Hello, my name is %s! I'm %s years old!",
                this.name, this.age);
        System.out.println(message);
    }
}


public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.showInfo();
    }
}