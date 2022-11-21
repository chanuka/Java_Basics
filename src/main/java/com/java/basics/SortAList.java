package com.java.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        //using Collections.sort() to sort ArrayList
        Collections.sort(strList);
        for (String str : strList) System.out.print(" " + str);


        List<Data> dl = new ArrayList<>();
        dl.add(new Data(2));
        dl.add(new Data(3));
        dl.add(new Data(1));
        System.out.println("Original List::" + dl);
        Collections.sort(dl);
        System.out.println("Naturally Sorted List::" + dl);

// using java 8 lambda Comparator-------------------------------
        List<Data> dl2 = new ArrayList<>();
        dl2.add(new Data(4));
        dl2.add(new Data(6));
        dl2.add(new Data(5));
        Collections.sort(dl2, new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.getId() - o2.getId();
            }
        });
//        Collections.sort(dl2, (d1, d2) -> {
//            return d1.getId() - d2.getId();
//        });
        System.out.println("Sorted List using Comparator::" + dl2);
    }
}

class Data implements Comparable<Data> {

    private int id;

    public Data(int i) {
        this.id = i;
    }

    @Override
    public int compareTo(Data d) {
        return this.id - d.getId();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Data{" + this.id + "}";
    }
}