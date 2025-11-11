package ImportantStreamQuestion;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 1, 2, 3 ,4,56,11,45,21,42,42,11);

        List<Integer> list2 = list.stream()
                .distinct()
                .toList();

        System.out.println(list2);


        HashSet<Integer> set = new HashSet<>();


        // for Unique values
        List<Integer> list1 = list.stream()
                .filter(n -> set.add(n))
                .toList();

        System.out.println(list1);

       /* // for duplicate values
        List<Integer> list1 = list.stream()
                .filter(n -> !set.add(n))
                .toList();

        System.out.println(list1);*/
    }
}
 