package java8;

interface A {
    void show();
}

public class LambdaDemo {
    public static void main(String[] args) {

        A obj = () -> System.out.println("hello");
        obj.show();
    }
}
