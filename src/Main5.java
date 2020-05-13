import java.util.Arrays;
import java.util.List;

/**
 * インタフェースを実装したクラスのメソッドを実行する
 */
public class Main5 {

    public static void main(String[] args) {

        List<Animal> animalList = Arrays.asList(new Dog(), new Cat());
        animalList.stream() // streamの取得
                .map(a -> a.cry()) // 中間操作
                .forEach(s -> System.out.println(s)); // 終端操作
    }
}