package CollectionQuestion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class TopKFrequentEle {
    /*Top K Frequent Elements
    Input: nums = [1, 1, 1, 2, 2, 3], k = 2
    Output: [1, 2]*/
    public static void topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0) + 1);
        }

        int[] arr = new int[k];

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            
        }

    }
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
            System.out.println("Hii");

    }
}
