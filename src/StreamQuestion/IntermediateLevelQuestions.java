package StreamQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateLevelQuestions {
    public static void main(String[] args) {
        // 1️⃣ From a list of integers, find the square of even numbers (no duplicates).
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 2, 4, 6, 8, 10);

        System.out.println(
                list1.stream()
                        .filter(n -> n%2 == 0)
                        .map(n -> n * n)
                        .distinct()
                        .toList()
        );

        // 2️⃣ Sort a list of names in reverse alphabetical order and collect them.
        List<String> list2 = List.of("Nikhil", "Atul", "Pawan", "Tejas", "Aniket", "Omi");

        System.out.println(
                list2.stream()
                        .sorted(Comparator.reverseOrder())
                        .toList()
        );


        // 3️⃣ Given a list of List<Integer>, flatten it into a single list using flatMap().
        List<List<Integer>> list3 = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8)
        );

        System.out.println(
                list3.stream()
                        .flatMap(List::stream)
                        .toList()
        );

        // 4️⃣ Find the first three even numbers from a list using filter() + limit().
        List<Integer> list4 = List.of(3, 8, 2, 5, 6, 10, 12, 9, 14);

        System.out.println(
                list4.stream()
                        .filter(x -> x %2 ==0)
                        .limit(3)
                        .toList()
        );

        // 5️⃣ Skip the first two elements in a list and collect the rest.
        List<String> list5 = List.of("Java", "Spring", "Hibernate", "Microservices", "Docker", "Kubernetes");
        System.out.println(
                list5.stream()
                        .skip(2)
                        .toList()
        );

        // 6️⃣ Given a list of names, sort by length, then alphabetically.
        List<String> list6 = List.of("Ravi", "Amit", "Ankita", "Om", "Suresh", "Jay");
        System.out.println(
                list6.stream()
                        .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                        .toList()
        );

        // 7️⃣ Extract all characters from a list of words (use flatMap() with String.chars()).
        List<String> list7 = List.of("hello", "world", "java", "stream");



        // 8️⃣ Filter out all null values safely from a list of strings.
        List<String> list8 = Arrays.asList("Nikhil", null, "Atul", null, "Pawan", "Tejas");
        System.out.println(
                list8.stream()
                        .filter(x -> x != null)
                        .toList()
        );


        // 9️⃣ Find the sum of squares of numbers greater than 10.
        List<Integer> list9 = List.of(4, 9, 12, 15, 20, 8, 3, 25);
        Integer sum = list9.stream()
                .filter(x -> x > 10)
                .map(x -> x * x)
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);


        // 🔟 Given a list of numbers, check if all are positive using allMatch().
        List<Integer> list10 = List.of(3, 5, 7, 9, -12, 15);
        boolean b = list10.stream()
                .allMatch(x -> x > 0);

        System.out.println(b);

    }
}
