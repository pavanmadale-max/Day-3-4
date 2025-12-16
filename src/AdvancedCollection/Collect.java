package AdvancedCollection;

import java.util.List;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {


        List<Integer> numbers= List.of(1,2,3,4,5,6);

        //Convert Stream Back To List
        List<Integer> even=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println(even);

    }
}
