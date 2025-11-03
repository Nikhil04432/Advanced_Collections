package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public class Maps{
    public static void main(String[] args) {

    /*    If hashCode() of key and key2 are same (which they are, since values are same), then HashMap will call
     equals() to confirm if keys are same.

        Since:
        key.equals(key2) is true
        and key.hashCode() == key2.hashCode() is true               //here, hashcode() is of String so its not using
                                                            memory address instead use content in string

➡️ So **HashMap considers them as the same key, not two different keys.*/

        String key = new String("key");
        String key2 = new String("key");

        Map<String,Integer> map = new HashMap<>();
        map.put(key,10);
        map.put(key2,20);
       /* Step 1: Objects

        new String("key") → always creates a new object in heap.

        So:

        key → points to 1st "key" object.

                key2 → points to 2nd "key" object.

                key == key2 → false (different objects).

        Step 2: How HashMap stores keys

        HashMap does not use == to compare keys.
                It uses hashCode() + equals().

                In String class:

        equals() → compares characters (not memory address).

        hashCode() → calculated from characters.

        Step 3: What happens when we put

        map.put(key, 10)
        → Map = {key=10}

        map.put(key2, 20)

        HashMap checks:
        Do we already have a key that equals key2?
        → Yes (key and key2 have same content "key")

        So, it updates the value.
        → Map = {key=20}
        */

       System.out.println(map);

        // using IdentityHashMap
        Map<String, String> map1 = new IdentityHashMap<>();

        String a = new String("key");
        String b = new String("key");

        map1.put(a, "Value1");
        map1.put(b, "Value2");
        // explain output :


//        System.out.println("Map size: " + map1.size());
//        System.out.println(map1);


        //output will be {key=Value1, key=Value2}  cz hashcode and equals are used of object so the address of both keys
        // are diff and they will act as unique
    }
}