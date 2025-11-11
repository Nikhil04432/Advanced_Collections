package ImportantStreamQuestion;

import java.util.List;

public class SkipFirstTwo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,2,1,4,5,3,6,6,8);

        System.out.println(
                list.stream()
                        .skip(2)
                        .toList()
        );
    }
}
