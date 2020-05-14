import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream処理の結果を配列にして取得する
 */
public class Main17 {

  public static void main(String[] args) {
    var list = Stream.of("tokyo", "nagoya", "osaka")
        .filter(s -> s.startsWith("t"))
        .collect(Collectors.toList());
  }
}