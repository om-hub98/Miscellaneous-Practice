package Java8.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TestInterface test=(x,y)->{return (x+y);};
        TestInterface test=(a,b)-> {return (a+b);};
        System.out.println("Sum of two number : "+test.sum(4,5));

        List<Integer> arrlist = new ArrayList<>();
        arrlist.add(4);
        arrlist.add(3);
        arrlist.add(40);
        arrlist.add(10);
        arrlist.add(8);
        arrlist.add(9);
        System.out.println("Printing list :");
        arrlist.forEach(n -> System.out.print(n+","));

        System.out.println();

        System.out.println("Printing even numbaers ::");
        arrlist.forEach(n->{
            if(n%2==0)
                System.out.print(n+",");
        });



    }
}
