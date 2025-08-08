package CollectionQuestion;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfWordInStr {

    public static void occurance(String str){
        Map<String,Integer> map = new HashMap<>();

        String[] strArr = str.split(" ");

        for(String s : strArr){
            map.put(s,map.getOrDefault(s,0) + 1);

//            if(map.containsKey(s)){
//                map.put(s,map.get(s) + 1);
//            }
//            else{
//                map.put(s,1);
//            }
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        occurance("Java is great and Java is powerful");
    }
}
