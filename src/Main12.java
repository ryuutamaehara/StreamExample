import java.util.stream.Stream;

/**
 * filterに該当する文字が無い場合emptyを取得する
 */
public class Main12 {

  public static void main(String[] args) {

    System.out.println(Stream.of("switch", "ps4", "pc")
        .filter(s -> s.startsWith("g"))
        .findFirst()
        .orElse("empty"));
  }
}