package generics;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args){

        // before generics

        ArrayList list = new ArrayList<>();

        list.add(4);
        list.add("Omi");
        list.add(3.14);

        // we can add any type of data in list and when we want to retrieve it we need to type cast it and if we
        // type cast it wrong then we will get ClassCastException

        Integer x = (Integer) list.get(0);
        String s = (String) list.get(1);
        Double d = (Double) list.get(2);

        System.out.println(x);
        System.out.println(s);
        System.out.println(d);

        // after generics
        ArrayList< Integer> list2 = new ArrayList<>();
        list2.add(4);
        // list2.add("Omi");  // compile time error

        Integer y = list2.get(0); // no need to type cast it
        System.out.println(y);

        // in this way we can achieve type safety and we can avoid ClassCastException at
        // runtime and we can catch it at compile time itself



    }

}
