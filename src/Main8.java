import java.util.stream.IntStream;

/**
 * 1~10のIntStreamを3までスキップし、４から5個分の値を取得する
 */
public class Main8 {

  public static void main(String[] args) {

    IntStream.range(1, 10)
        .skip(3)
        .limit(5)
        .forEach(System.out::println); // 4, 5, 6, 7, 8
  }
}