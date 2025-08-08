package CollectionQuestion;


import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/*// Find First Non-Repeating Character in a String
//Input: "swiss"
//Output: w*/
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
