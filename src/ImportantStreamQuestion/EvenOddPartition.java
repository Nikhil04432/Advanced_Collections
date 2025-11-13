package ImportantStreamQuestion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddPartition {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,56,21,42,42,11);

        Map<Boolean, List<Integer>> part = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(part);
    }
}
