package ImportantStreamQuestion;

import java.util.HashSet;
import java.util.List;

// Find duplicate elements in a list
public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,2,1,4,5,3,6,6,8);
        HashSet<Integer> set = new HashSet<>();

        List<Integer> duplicate = list.stream()
                .filter(n -> !set.add(n))
                .toList();

        System.out.println(duplicate);
    }
} 
