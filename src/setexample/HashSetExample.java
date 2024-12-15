package setexample;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();

        // adding
        set1.add("Mango");
        set1.add("Guava");
        set1.add("Banana");
        set1.add(null);
        set1.add("Guava");

        System.out.println("set1 is : "+set1);

        // remove
        set1.remove("Banana");
        System.out.println("set1 after remove : "+set1);
        System.out.println("1st foreach");
        for(String s1:set1){
            System.out.println(s1);
        }
        System.out.println("2nd foreach");
        for(String s1:set1){
            System.out.println(s1);
        }

    }
}
