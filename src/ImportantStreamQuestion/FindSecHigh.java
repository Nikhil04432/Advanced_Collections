package ImportantStreamQuestion;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecHigh {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,56,21,42,42,11);

        Integer secHigh = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println(secHigh);
    }
}
