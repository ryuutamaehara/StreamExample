import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 降順ソートを実施(Comparatorを使用)
 */
public class Main7 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        integerList.stream() // streamの取得
                .sorted(Comparator.reverseOrder()) // 中間操作
                .forEach(i -> System.out.println(i)); // 終端操作
    }
}