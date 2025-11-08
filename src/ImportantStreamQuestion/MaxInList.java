package ImportantStreamQuestion;

import java.util.Comparator;
import java.util.List;

public class MaxInList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,3,6,36,365,24,15,561,352);

        Integer max = list.stream()
                .max(Integer::compare)
                .orElseThrow();

        System.out.println(max);
    }
}
