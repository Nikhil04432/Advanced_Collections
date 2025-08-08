package CollectionQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDupFromListAndInsertionOrderPreserve {

    public static void operate(List<Integer> list){
        // LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(Integer ele : list){
            set.add(ele);
        }

        System.out.println(set);
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 20, 10, 30, 20, 40};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Before ");
        System.out.println(list);
        System.out.println("After ");
        operate(list);
    }
}
