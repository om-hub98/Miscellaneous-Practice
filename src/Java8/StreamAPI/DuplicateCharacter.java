package Java8.StreamAPI;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

            /*
                Q) Print all the duplicate characters from the given string
                for e.g : input = "Adegsads ufedhvhuh"
                output : [a, s, d, e, u, h]
            * */
public class DuplicateCharacter {
    public static void main(String[] args) {
        String input = "Adegsads ufedhvhuh";
        input = input.toLowerCase();
       // normalMethod(input);
        streamApiMethod(input);
    }
    public static void streamApiMethod(String str){
        //char[] ch = str.toCharArray();
        try {
//            List<String> stream = Arrays.stream(str.split(""))
//                                             .collect(Collectors.toList());
//            System.out.println(stream);
            Map<Character, Long> map = str.chars()
                    .mapToObj(ch -> (char) ch)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


            List<Character> list = map.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            System.out.println(list);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void normalMethod(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(!map.containsKey(ch))map.put(ch,1);
            else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        List<Character> list =new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) list.add(entry.getKey());
        }
        System.out.println(list);
    }

}
