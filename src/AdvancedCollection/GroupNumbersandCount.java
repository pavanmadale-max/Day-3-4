package AdvancedCollection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbersandCount {

    public static void main(String[] args) {

        List<Integer> number =List.of(1,2,3,4,5,6,7);

        Map<String,Long> count=number.stream().collect(Collectors.groupingBy(n->(n%2==0)?"even":"odd",Collectors.counting()));

        System.out.println(count);

    }

}
