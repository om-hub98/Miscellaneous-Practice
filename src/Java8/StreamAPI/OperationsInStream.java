package Java8.StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class OperationsInStream {
    public static void main(String[] args) {
        //Source
        List<Integer> listOfIntegers = Arrays.asList(1,5,3,9,7,10,19,18,12,16,20,28,29);
        List<String> listOStrings = Arrays.asList("apple", "ball", "cat", "egg");
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "ball"),
                Arrays.asList("cat", "dog"),
                Arrays.asList("egg", "fish", "apple")
        );

        // filtering operation => to filter out evan numbers greater than 10
        List<Integer> newList = listOfIntegers.stream()
                                    .filter(x->x%2==0)
                                    .collect(Collectors.toList());

        System.out.println("Filtering example : "+newList);

        // mapping operation => to map list of integers into square of it
        List<Integer> mapList = listOfIntegers.stream()
                                    .map(x -> x*2)
                                    .collect(Collectors.toList());

        System.out.println("Mapping example : "+ mapList);


        List<String> resultInUpperCase = listOStrings.stream()
                                                .map(String::toUpperCase)
                                                .collect(Collectors.toList());
        System.out.println("Mapping upper case words : "+resultInUpperCase);


        // flatmap
        List<String> flatMapList = listOfLists.stream()
                                                .flatMap(Collection::stream)
                                                .distinct()
                                                .collect(Collectors.toList());

        System.out.println("Flatten List : "+flatMapList);


    }
}
