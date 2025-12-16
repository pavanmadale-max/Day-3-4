package AdvancedCollection;

import java.util.List;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> num=List.of(1,2,3,4);

        //combines stream elements into one result using an accumulator function.
        //takes a collection of values and combines them into a single result.
        int sum=num.stream().reduce(0,(a,b)->a+b);

        System.out.println(sum);


    }
}
