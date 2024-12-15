package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // defining the arryalist
        LinkedList<Integer> list1 = new LinkedList<>();

        // adding or inserting data
        list1.add(23);
        list1.add(33);
        list1.add(11);
        list1.add(98);
        list1.add(44);
        list1.add(null);
        list1.add(33);

        System.out.println("list1 : "+list1);

        // remove data
        list1.remove(2);
        System.out.println("list1 after removing 2nd index : "+list1);

        list1.remove(null);
        System.out.println("list1 after removing null value : "+list1);

        // search data at specific position
        System.out.println("list1 at 3rd index : "+list1.get(3));
        System.out.println("list1 at 5th index : "+list1.get(4));

        // size of the list
        System.out.println("size of list1 : "+list1.size());

        System.out.println("index of 33 value :"+list1.indexOf(33));

        // sort
        Collections.sort(list1);
        System.out.println("after sorting : "+list1);

        //traversing the linkedlist using foreach loop
        System.out.println("Traversing using foreach loop");
        for(Integer l1 : list1){
            System.out.println(l1);
        }

    }
}
