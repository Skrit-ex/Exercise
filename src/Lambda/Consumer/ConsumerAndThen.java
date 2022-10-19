package Lambda.Consumer;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static void main(String[] args) {
        Consumer<String> stringConsumer1 = string -> System.out.println(string.toUpperCase());
        Consumer<String> stringConsumer2 = string -> System.out.println(string.toLowerCase());

        stringConsumer1.andThen(stringConsumer2).accept("you must be free");
    }
}