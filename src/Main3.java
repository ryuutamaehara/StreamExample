import java.util.Arrays;
import java.util.List;

/**
 * 要素を２倍にして表示する
 */
public class Main3 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        integerList.stream() // streamの取得
                .map(i -> i * 2) // 中間操作
                .forEach(i -> System.out.println(i)); // 終端操作
    }
}