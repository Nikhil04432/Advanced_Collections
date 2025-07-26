package ComparatorPractice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class SortDate {
    public static void main(String[] args) {
        List<String> dates = Arrays.asList("2023-01-10", "2021-12-25", "2022-07-14");


        dates.sort((a, b) -> {
            LocalDate dat1 = LocalDate.parse(a);
            LocalDate dat2 = LocalDate.parse(b);
            return dat1.compareTo(dat2);
        });

        System.out.println(dates);

    }
}
