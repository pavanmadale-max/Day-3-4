package AdvancedCollection;

import java.util.List;

public class Filtering {

    public static void main(String[] args) {

        List<Integer> number=List.of(1,2,3,4,5,6);

        //keep only the elements that pass a condition
        //selects elements based on a condition
        number.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
