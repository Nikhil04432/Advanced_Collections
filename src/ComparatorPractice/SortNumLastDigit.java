package ComparatorPractice;

import java.util.Arrays;
import java.util.List;

public class SortNumLastDigit {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 45, 12, 67, 34);

        System.out.println(numbers);

        // 89 56
        numbers.sort((a, b) -> b%10 - a%10);

        System.out.println(numbers);

    }
}
