package AdvancedCollection;

import java.util.List;

public class sorted {

    public static void main(String[] args) {

        List<String> s= List.of("Raju","Pavan","Amit");

       //sorts by order
        s.stream().sorted().forEach(System.out::println);

        System.out.println();
        //sorts by length
        s.stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);

    }
}
