package ComparatorPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortStrLen {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Om");
        strings.add("Pawan");
        strings.add("More");
        strings.add("Nikhil");
        strings.add("Chaudhuri");
        strings.add("Gil");
        strings.add("Somashekar");

      /*  System.out.println(strings);

        strings.sort(null);

        System.out.println(strings);        // default sorting alphabetically
    */
        // sort on basis of length    smaller should come first

        //strings.sort(new MyComparator());

        //  using lamba function

        strings.sort((a, b) ->  a.length() - b.length() );

        System.out.println(strings);


    }
}

//class MyComparator implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        // suppose "hello"  "Hey"
//        // we want hey first then hello so we want o2 to come first for that we want to return +ve value
//
//        return o1.length() - o2.length();
//
//    }
//}

