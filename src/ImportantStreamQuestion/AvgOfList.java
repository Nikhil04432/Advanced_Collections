package ImportantStreamQuestion;

import java.util.List;

public class AvgOfList {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,56,21,42,42,11);

        double avg = list.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0);

        System.out.println(avg);
    }
}
