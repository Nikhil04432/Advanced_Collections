package ImportantStreamQuestion;

import java.util.List;

public class CheckDivisibleBy5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,56,21,42,42,11);

        System.out.println(
                list.stream()
                        .anyMatch(n-> n %5 == 0)
        );

    }
}
