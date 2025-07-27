package ArrayList_Vector;

import java.lang.invoke.VolatileCallSite;
import java.util.ArrayList;
import java.util.Vector;

public class ThreadSafeDemo {
    public static void main(String[] args) {

       /* We are adding 2000 elements in Arraylist so it's size should  be 2000
         but output is something around 1500-1600
        it's becz ArrayList is not thread safe */

  /*      ArrayList<Integer> list = new ArrayList<>();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(i);
                }
            }
        };

        Thread t2 = new Thread(() ->{
            for (int i = 1; i <= 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(list.size());*/



        Vector<Integer> list = new Vector<>();

        //it will print 2000 becz vector is thread safe

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(i);
                }
            }
        };

        Thread t2 = new Thread(() ->{
            for (int i = 1; i <= 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(list.size());
    }
}
