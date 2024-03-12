package java8;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(3, 4, 5, 6, 7, 8, 9);
        values.forEach(i -> System.out.println(i));
    }
}
