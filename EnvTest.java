public class EnvTest {
    public static void main(String[] args) {
        System.out.println("Hello, World! (Java)");
    }
}

/*

javac EnvTest.java && java EnvTest

javac EnvTest.java

jar cvfe EnvTest.jar EnvTest EnvTest.class

c: Создает новый архив.
v: Создает в консоли подробный вывод о файлах, которые добавляются в архив.
f: Указывает, что имя архива будет следовать в командной строке (в данном случае, EnvTest.jar).
e: Указывает точку входа для автономного приложения, содержащегося в JAR-файле, т.е. имя класса, в котором находится метод main (в данном случае, EnvTest).

java -jar EnvTest.jar

*/