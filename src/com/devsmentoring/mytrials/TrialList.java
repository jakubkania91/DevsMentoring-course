package com.devsmentoring.mytrials;

import java.util.ArrayList;
import java.util.List;

public class TrialList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Karol");
        names.add("Roman");
        names.add("Adam");
        names.add("Zbyszek");



  //      String name = names.get(2);
  //      System.out.println(name);

   //     boolean result = names.contains("Zbyszek");
   //     System.out.println(result);

        for (String element : names) {
            System.out.println(element);
        }
    }
}
