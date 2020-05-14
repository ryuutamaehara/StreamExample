import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream処理の結果をHashMapにして取得する
 */
public class Main19 {

  public static void main(String[] args) {
    var list = Stream.of("switch", "ps4", "pc")
        .filter(s -> s.startsWith("p"))
        .collect(Collectors
            .toMap(s -> s, s -> "値 :" + s));

    //for文でいい気けどあえてforEachで出力する
    Stream.of(list)
        .forEach(System.out::println);

    //インスタンスがHashSetであることを確認する
    System.out.println(list
        .getClass()
        .getName());
  }
}