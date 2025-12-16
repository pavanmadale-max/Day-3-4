package AdvancedCollection;

import java.util.List;

public class MinandMax {
    public static void main(String[] args) {

        List<Integer>numbers =List.of(20,10,30,25,50,40);

        int max=numbers.stream().mapToInt(n->n).max().getAsInt();
        System.out.println(max);

        int min=numbers.stream().mapToInt(n->n).min().getAsInt();
        System.out.println(min);

    }
}
