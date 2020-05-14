import java.util.stream.Stream;

/**
 * いずれかの値がanyMatchの条件に合致する場合trueを取得する
 */
public class Main13 {

  public static void main(String[] args) {

    //true
    System.out.println(Stream.of("switch", "ps4", "pc")
        .anyMatch(s -> s.length() == 6));

    //false
    System.out.println(Stream.of("switch", "ps4", "pc")
        .anyMatch(s -> s.length() == 5));
  }
}