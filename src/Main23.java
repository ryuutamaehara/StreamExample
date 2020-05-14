import java.util.ArrayList;
import java.util.List;

/**
 * Streamの要素を1つもStringにまとめて取得する
 */
public class Main23 {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("ps4");
    list.add("switch");
    list.add("pc");
    list.add("ps5");

    System.out.println(
        list.stream()
            .sorted()
            .reduce((result, str) -> {
              return result + "," + str;
            })
            .orElse(""));

    //listの要素を全削除
    list.removeAll(list);

    //reduceの引数にidentityをセットしておけばorElse()は不要
    System.out.println(
        list.stream()
            .sorted()
            .reduce("segaSaturn", (result,str) -> {
              return result + "," + str;
            }));
  }
}