import java.util.ArrayList;
import java.util.List;

/**
 * Stream処理の結果から最大値を取得する
 */
public class Main21 {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    //listの最大値を表示する
    System.out.println(list.stream()
        .max((int1, int2) -> int1 - int2)
        .orElse(-1));

    //listの要素を削除する
    list.removeAll(list);

    //listの最大値を表示する(要素なしのためorElseが表示される)
    System.out.println(list.stream()
        .max((int1, int2) -> int1 - int2)
        .orElse(-1));
  }
}