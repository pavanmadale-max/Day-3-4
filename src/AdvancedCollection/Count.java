package AdvancedCollection;

import java.util.List;

public class Count {
    public static void main(String[] args) {


        List<Integer> nums=List.of(10,20,30,40,50);

        //returns the number of elements in the stream.
        long countNum=nums.stream().count();
        System.out.println(countNum);


    }
}
