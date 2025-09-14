package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,9,7,10,19,18,12,16,20,28,29);
        List<Integer> newList = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(newList);
    }
}
