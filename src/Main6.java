import java.util.Arrays;
import java.util.List;

/**
 * 降順ソートを実施
 */
public class Main6 {

  public static void main(String[] args) {

    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
    integerList.stream() // streamの取得
        .sorted((a, b) -> Integer.compare(a, b)) // 中間操作
        .forEach(i -> System.out.println(i)); // 終端操作
  }
}