package AdvancedCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingaList {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Ravi");
        name.add("Aman");
        name.add("Pavan");

        //sort
        Collections.sort(name);
        System.out.println(name);

        //sorts based on length
        name.sort((a,b)->a.length()-b.length());
        System.out.println(name);
    }
}
