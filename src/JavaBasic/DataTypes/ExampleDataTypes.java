package JavaBasic.DataTypes;

import java.util.HashMap;
import java.util.Map;

public class ExampleDataTypes {
    public static void main(String[] args) {
        byte byte_num = 125;       //range : -128 to 127
        short short_num = 130;
        int int_num = 150;
        long long_num = 4000;
        float float_num = 14.45f;
        double double_num = 4000.5645446;

        //String
        String str = "Omraj";
        String str_obj = new String("Omraj");

        //Array
        int[] int_arr = {4,8,9,6,4};
        int[] int_arr_obj = new int[]{9,4,1,2,5,6};
        String[] str_arr = {"Omraj", "Niraj", "Yuvi"};

        Map<String, Integer> map = new HashMap<>();
        map.put("John",101);
        map.put("Messi",07);
        map.put("Ronaldo",18);     //018 => invalid octal number
        map.put("John",101);


        /// Print Numbers
        System.out.println(str);                     // prints string
        System.out.println(int_arr);                 // prints hashcode
        System.out.println(int_arr_obj);             // prints hashcode
        System.out.println(map);                     // prints key value pairs
        System.out.println(map.get("John1"));        // prints key value pairs


    }
}
