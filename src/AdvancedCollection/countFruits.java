package AdvancedCollection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class countFruits {

    public static void main(String[] args) {

        List<String>  fruit=List.of("apple","banana","apple","orange","banana");

      Map<String,Long> fruitCount= fruit.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));

      System.out.println(fruitCount);
    }
}
