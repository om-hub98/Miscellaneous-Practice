package Java8.LambdaExpression.PredicateExample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Omraj","Om","Raj");
        list.forEach(elem-> System.out.println(elem));

        Predicate<Integer> func = (x)-> {
                    if(x%2==0) return true;
                    else return false;
        };
        System.out.println(func.test(10));

    }
    public static boolean testString(Predicate<Integer> func){
        return false;
    }
}
