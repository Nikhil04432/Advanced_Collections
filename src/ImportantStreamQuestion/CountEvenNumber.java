package ImportantStreamQuestion;

import java.util.LinkedHashSet;
import java.util.List;

public class CountEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,2,1,4,5,3,6,6,8, 89, 90);

        long count = list.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(count);
 
    }
}
