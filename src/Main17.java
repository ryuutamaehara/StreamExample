import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream処理の結果をArrayListにして取得する
 */
public class Main17 {

  public static void main(String[] args) {
    var list = Stream.of("switch", "ps4", "pc")
        .filter(s -> s.startsWith("p"))
        .collect(Collectors.toList());

    //for文でいい気けどあえてforEachで出力する
    Stream.of(list)
        .forEach(System.out::println);

    //インスタンスがArrayListであることを確認する
    System.out.println(list
        .getClass()
        .getName());
  }
}