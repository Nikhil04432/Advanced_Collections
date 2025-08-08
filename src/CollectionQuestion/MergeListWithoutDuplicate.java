package CollectionQuestion;

import java.util.*;
import java.util.Arrays;

/*list1 = [1, 3, 5, 7]
        list2 = [2, 3, 5, 8]
        Output: [1, 2, 3, 5, 7, 8]*/

public class MergeListWithoutDuplicate {
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 3, 5, 8);

        Set<Integer> treeSet = new TreeSet<>(list1);
        treeSet.addAll(list2);

        System.out.println(treeSet);




    }
}
