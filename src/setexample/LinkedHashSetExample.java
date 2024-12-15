package setexample;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();

        set1.add(22);
        set1.add(55);
        set1.add(07);//00000111
        set1.add(33);
        set1.add(22);
        set1.add(null);

        System.out.println("set1 is : "+set1);

        set1.remove(22);
        System.out.println("set1 after remove:"+set1);

        for(Integer s1:set1){
            System.out.println(s1);
        }
    }
}
