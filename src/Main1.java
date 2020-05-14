import java.util.ArrayList;
import java.util.Arrays;

/**
 * 5文字以上のStringを大文字にしてprintする
 */
public class Main1 {

  public static void main(String[] args) {

    // ①Data Sourceを準備する
    var list = new ArrayList<String>(
        Arrays.asList("bat", "spider", "america", "iron", "joker", "hulk"));

    // ②ストリームを作る
    list.stream()
        .filter(s -> s.length() > 5)
        .map(String::toUpperCase)           // ③中間処理を行う　returnはいずれもStream<T>
        .forEach(System.out::println);        // ④終端処理を行う        // 結果：SPIDER,AMERICA
  }
}