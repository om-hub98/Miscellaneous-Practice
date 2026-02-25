package DataStructure.Array;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfList = List.of(List.of("Java", "Spring Boot"), List.of("Python","FastAPI"), List.of("JS","React"));
        System.out.println("Original :"+listOfList);

        List<String> flatList = listOfList.stream().flatMap(List::stream).toList();
        System.out.println("Flat List : "+flatList);

    }
}
