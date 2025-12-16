package AdvancedCollection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNameBYFirstLetter {

    public  static void main(String[] args) {

        List<String> fruit=List.of("apple","banana","apple","orange","banana");

       Map<Character,List<String>> name=fruit.stream().collect(Collectors.groupingBy(s->s.charAt(0)));

       System.out.println(name);
    }
}
