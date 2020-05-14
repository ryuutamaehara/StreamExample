import java.util.stream.Stream;

/**
 * 最初の文字がpの文字を取得する
 */
public class Main11 {

    public static void main(String[] args) {

        System.out.println(Stream.of("switch", "ps4", "pc")
                .filter(s -> s.startsWith("p"))
                .findFirst()
                .orElse("empty"));
    }
}