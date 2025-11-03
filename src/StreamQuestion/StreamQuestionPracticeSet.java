package StreamQuestion;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class StreamQuestionPracticeSet {
    public static void main(String[] args) {


        // 1. Create a stream from a list of integers and print only odd numbers.
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = list.stream()
                .filter(x -> x % 2 != 0)
                .toList();

        System.out.println(list1);


        // 2. Convert a list of strings to uppercase using map().
        List<String> l1 = List.of("nikhil", "Atul", "omi", "pawan", "Aniket", "Tejas");

        List<String> list2 = l1.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(list2);

        // Find how many names in a list start with the letter "A".

        long count = l1.stream()
                .filter(x -> x.startsWith("A"))
                .count();

        System.out.println(count);

        // From a list of integers, print only unique numbers using distinct().

        List<Integer> l3 = List.of(1,4,3,2,5,1,3,5,67,4,5,435,6,53,2);

        /*l3.stream()
                .distinct()
                .forEach(System.out::println);
*/
        //5️⃣ Given an array of integers, find the sum using reduce().

        Integer sum = list.stream()
                .reduce(Integer::sum)
                .get();

      //  System.out.println(sum);

        //6️⃣ Create a stream of numbers 1–10 using Stream.iterate() and print them.

        Stream<Integer> stream = Stream.iterate(1,n->n+1)
                .limit(10);
        //System.out.println(stream.toList());

        //Check if any number in the list is greater than 100 using anyMatch().

        System.out.println(         l3.stream()
                .anyMatch(n -> n > 100));

        //8️⃣ Given a list of words, print their lengths using map().

        l1.stream()
                .map(n -> n.length())
                .forEach(System.out::println);


       /* 9️⃣ Count how many numbers in a list are divisible by 3.

        System.out.println(
                l3.stream()
                        .filter(n-> n %3 == 0)
                        .count()
        );
*/
        // 🔟 Convert a list of names into a list of their lengths and collect into a new list.

        System.out.println(
                l1.stream()
                        .map(n->n.length())
                        .toList()
        );

    }
}
