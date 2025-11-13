package ImportantStreamQuestion;

import java.util.List;
import java.util.stream.Stream;

public class FlatList {
    public static void main(String[] args) {
        List<List<String>> listOLists = List.of(List.of("a", "b"), List.of("c", "d"));

        Stream<String> stringStream = listOLists.stream()
                .flatMap(List::stream);

        System.out.println(stringStream.toList());
    }
}
