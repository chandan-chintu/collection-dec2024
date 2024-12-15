package setexample;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();

        set1.add(22);
        set1.add(55);
        set1.add(07);//00000111
        set1.add(33);
        set1.add(22);
        set1.add(13);
        set1.add(9);

        System.out.println("set1 is : "+set1);

        set1.remove(22);
        System.out.println("set1 after remove:"+set1);

        for(Integer s1:set1){
            System.out.println(s1);
        }
    }
}
