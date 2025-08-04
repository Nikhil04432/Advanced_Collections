package Comparable;

import java.util.ArrayList;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(90);
        list.add(3);
        list.add(81);
        list.add(5);

        list.sort(null);        // null means natural ordering of ( here Integer class ) and Integer
        // implements Comparable and has the definition of compareTo() to sort it in ascending order

       // System.out.println(list);

       /*  .. what if there is user defined class like Student here and we try to sort it and passing null then
         Exception will arise cz we don't have implemented Comparable .. we need Comparable for natural ordering
        So implement Comparable and write the sorting ( for natural ordering ) in comapreTo()    */

        //before implementing Comparable
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("nik",89));
        list1.add(new Student("om",9));
        list1.add(new Student("shreyas",29));
        list1.add(new Student("omie",11));

        //trying to sort and exception occured                  // to see result remove implement COmparable from Student
        list1.sort(null);

        System.out.println(list1);

    }

}
