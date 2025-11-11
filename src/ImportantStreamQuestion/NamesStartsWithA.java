package ImportantStreamQuestion;

import java.util.List;

public class NamesStartsWithA {
    public static void main(String[] args) {
        List<String> str = List.of("Archi","niks","pawan","akash", "Abhay");

        List<String> list = str.stream()
                .filter(n -> n.startsWith("A"))
                .toList();

        System.out.println(list);

    }
} 
