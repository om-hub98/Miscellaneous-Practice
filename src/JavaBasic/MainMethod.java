package JavaBasic;

import java.util.Arrays;

public class MainMethod {
    public static void main(String[] args) {
        args=new String[] {"a","b"};
        System.out.println("Calling Main method..."+args.length);
        main(new Integer[]{1,2,3});
    }
    public static void main(Integer[] args) {
        System.out.println("Overloaded Main method..."+ Arrays.toString(args));
        //main(new String[]{"a","b"});

        String str ="Omraj Pradhan";
        System.out.println(str.indexOf("Pra"));
        System.out.println((str.replaceFirst("On","Ni")));
    }
}
