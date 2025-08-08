package ParallelStream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {


            //for sequential stream
        long before = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();

        list.stream().map(x-> factorial(x)).toList();

        long after = System.currentTimeMillis();
        System.out.println("time req for sequential stream to execute "+(after-before)+"ms");


        //for parallel stream
        long beforeParallel = System.currentTimeMillis();
        List<Integer> list1 = Stream.iterate(1, x -> x + 1).limit(20000).toList();

        list.parallelStream().map(x-> factorial(x)).toList();

        long afterParallel = System.currentTimeMillis();

        System.out.println("time req for parallel stream to execute "+ (afterParallel-beforeParallel)+ "ms");
    }

    public static int factorial(int a ){
        int fact = 1;

        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
