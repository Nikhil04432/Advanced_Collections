package ImportantStreamQuestion;

import java.util.Map;
import java.util.stream.Collectors;

public class FreqOfEachChar {
    public static void main(String[] args) {
        String str = "I love Java";

        Map<Character, Long> freq = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(freq);
    }
}
