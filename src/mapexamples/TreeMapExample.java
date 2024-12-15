package mapexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Integer,String> map1 = new TreeMap<>();


        // adding
        map1.put(105,"Mango");
        map1.put(103,"Guava");
        map1.put(102,"Banana");
        map1.put(104,"Pineapple");
        map1.put(101,"Mango");
       // map1.put(null,"Orange");
        map1.put(101,"Watermelon");// recent value is taken
        //map1.put(null,null);

        System.out.println("map1 is : "+map1);

        System.out.println("get element at 102 : "+map1.get(102));

        map1.remove(105);
        System.out.println("map1 after removing null key : "+map1);

        System.out.println("foreach-1 for map traversal");
        for (Map.Entry m1: map1.entrySet()){
            System.out.println(m1.getKey()+"-------"+m1.getValue());
        }

        System.out.println("foreach-2 for map traversal");
        for (Map.Entry m1: map1.entrySet()){
            System.out.println(m1);
        }

    }
}
