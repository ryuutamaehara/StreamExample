import java.util.stream.Stream;

/**
 * ソート前の値とソート後の値を確認する
 */
public class Main9 {

    public static void main(String[] args) {

        Stream.of("switch", "ps4", "pc")
                .peek(System.out::println)
                .sorted()
                .forEach(System.out::println);  //pc, ps4, switch
    }
}