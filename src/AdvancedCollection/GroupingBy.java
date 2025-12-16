package AdvancedCollection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {


        List<Integer> numbers=List.of(1,2,3,4,5,6);

        //Put elements into buckets based on some rule.
        Map<String,List<Integer>> group=numbers.stream().collect(Collectors.groupingBy(n->(n%2==0)?"even":"odd"));

        System.out.println(group);

    }
}
