import java.util.stream.Stream;

/**
 * すべての値がallMatchの条件に合致する場合trueを取得する
 */
public class Main14 {

    public static void main(String[] args) {

        //true
        System.out.println(Stream.of("switch", "ps4", "pc")
        .allMatch(s -> s.length() > 1));

        //false
        System.out.println(Stream.of("switch", "ps4", "pc")
                .allMatch(s -> s.length() > 2));
    }
}