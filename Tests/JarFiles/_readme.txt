Сначала скомпилируйте ваш Java-файл с помощью javac:
javac Main.java

Затем создайте файл манифеста, manifest.txt, который указывает точку входа в ваше приложение. В этом файле должна быть строка Main-Class: Main, где Main - это имя вашего основного класса:
echo "Main-Class: Main" > manifest.txt

Наконец, создайте JAR-файл с помощью jar:
jar cvfm Main.jar manifest.txt Main.class

Это создаст Main.jar, который можно запустить с помощью java -jar Main.jar