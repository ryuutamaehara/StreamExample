import java.util.stream.Stream;

/**
 * いずれか値がnoneMatchの条件に合致しない場合trueを取得する
 */
public class Main15 {

    public static void main(String[] args) {

        //true
        System.out.println(Stream.of("switch", "ps4", "pc")
        .noneMatch((s -> s.length() > 6)));

        //false
        System.out.println(Stream.of("switch", "ps4", "pc")
                .noneMatch((s -> s.length() > 1)));
    }
}