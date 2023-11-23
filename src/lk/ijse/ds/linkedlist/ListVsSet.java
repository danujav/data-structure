package lk.ijse.ds.linkedlist;

/*
    @author DanujaV
    @created 11/23/23 - 3:24 PM   
*/

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(34);
        list.add(12);
        list.add(5);
        list.add(75);
        System.out.println("List: " + list);

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(34);
        set.add(12);
        set.add(5);
        set.add(75);
        System.out.println("Set: " + set);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(5);
        set2.add(34);
        set2.add(12);
        set2.add(5);
        set2.add(75);
        System.out.println("Set2: " + set2);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(5);
        set3.add(34);
        set3.add(12);
        set3.add(5);
        set3.add(75);
        System.out.println("Set3: " + set3);
    }
}
