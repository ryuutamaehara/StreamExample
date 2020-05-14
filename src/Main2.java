import java.util.Arrays;
import java.util.List;

/**
 * 1〜5の中で偶数だけを表示する
 */
public class Main2 {

  public static void main(String[] args) {

    //StreamAPIを使わない場合
//        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
//        for (Integer i : integerList) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

    //StreamAPIを使う場合
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
    integerList.stream() // streamの取得
        .filter(i -> i % 2 == 0) // 中間操作
        .forEach(i -> System.out.println(i)); // 終端操作

    //メッソドチェインを使わない場合
//        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> stream = integerList.stream(); // streamの取得
//        Stream<Integer> stream2 = stream.filter(i -> i % 2 == 0); // 中間操作
//        stream2.forEach(i -> System.out.println(i)); // 終端操作
  }
}