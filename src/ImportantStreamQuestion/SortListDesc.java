package ImportantStreamQuestion;

import java.util.Comparator;
import java.util.List;

public class SortListDesc {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,56,21,42,42,11);

        List<Integer> list1 = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(list1);
    }
}
