import java.util.stream.Stream;

/**
 * Stream処理の結果を配列(Object[])にして取得する
 */
public class Main16 {

  public static void main(String[] args) {
    var list = Stream.of("switch", "ps4", "pc")
        .filter(s -> s.startsWith("p"))
        .toArray();

    //for文でいい気けどあえてforEachで出力する
    Stream.of(list)
        .forEach(System.out::println);
  }
}