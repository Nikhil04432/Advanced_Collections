package ImportantStreamQuestion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLen {
    public static void main(String[] args) {
        List<String> list = List.of("nikhil", "omi", "atul", "abc", "waxy", "abhish");

        Map<Integer, List<String>> strlen = list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(strlen);

        String collect = list.stream()
                .collect(Collectors.joining(", "));

        System.out.println(collect);
    }
}
