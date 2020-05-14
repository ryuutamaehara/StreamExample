import java.util.Arrays;
import java.util.List;

/**
 * 要素の型を変換して表示する
 */
public class Main4 {

  public static void main(String[] args) {

    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
    integerList.stream() // streamの取得
        .map(i -> "値は" + i) // 中間操作 //型をStringに変換する
        .forEach(s -> System.out.println(s)); // 終端操作
  }
}