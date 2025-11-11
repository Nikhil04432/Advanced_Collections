package ImportantStreamQuestion;

import java.util.List;

public class SumOfAllNoInList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,2,1,4,5,3,6,6,8);

        Integer sum = list.stream()
                .reduce((a, b) -> a + b)
                .orElse(0);

        int sum2 = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);

        System.out.println(sum);
    }
}
