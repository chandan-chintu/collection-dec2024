package listexample;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stck1 = new Stack<>();

        // adding the data
        stck1.push("Mango");
        stck1.push("Banana");
        stck1.push("Guava");
        stck1.push("Mango");
        stck1.push(null);

        System.out.println("stck1 is : "+stck1);

        // remove data
        stck1.pop();
        System.out.println("stck1 after 1st pop : "+stck1);
        stck1.pop();
        System.out.println("stck1 after 2nd pop : "+stck1);

        for (String s1 : stck1){
            System.out.println(s1);
        }

    }
}
