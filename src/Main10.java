import java.util.stream.Stream;

/**
 * 値の重複を削除する
 */
public class Main10 {

  public static void main(String[] args) {

    Stream.of("switch", "switch", "ps4", "ps4")
        .distinct()
        .forEach(System.out::println);
  }
}