package AdvancedCollection;

import java.util.List;

public class Maping {
    public static void main(String[] args) {

        List<Integer> number=List.of(1,2,3,4,5);

        //transforms each element into a new value.
        number.stream().map(n->n*n).forEach(System.out::println);

        List<String> names=List.of("pavan","amit","ravi");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
