package ImportantStreamQuestion;

import java.util.List;

public class CheckAllEven {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,56,22,42,42,11);

        System.out.println(
                list.stream()
                        .allMatch(n-> n %2 == 0)
        );

    } 
}
