import java.util.ArrayList;
import java.util.List;

/**
 * Streamの要素数を取得する
 */
public class Main22 {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    //listの要素数を表示する
    System.out.println(list.stream()
        .count());
  }
}