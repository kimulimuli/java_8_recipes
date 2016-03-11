import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by Ken Kousen on 3/11/16.
 */
public class ImplementConsumer {
    public static void main(String[] args) {
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }
}
