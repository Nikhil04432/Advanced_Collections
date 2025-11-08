package ImportantStreamQuestion;

import java.util.List;

public class ListToUpperCase {
    public static void main(String[] args) {
        List<String> str = List.of("niks","pawan","omi");

        List<String> list = str.stream()
                //.map( String::toUpperCase())
                .map(n -> n.toUpperCase())
                .toList();

        System.out.println(list);
    }
}
