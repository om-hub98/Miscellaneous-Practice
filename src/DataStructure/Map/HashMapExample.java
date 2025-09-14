package DataStructure.Map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,List<Integer>> map = new HashMap<>();
        List<Integer> oddList = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        List<Integer> evenList = new ArrayList<>(Arrays.asList(2,4,6,8));

        map.put("ODD", oddList);
        map.put("EVEN", evenList);

        System.out.println(map.getOrDefault("ODD", Arrays.asList(0)));
    }
}
