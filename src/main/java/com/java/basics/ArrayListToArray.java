package com.java.basics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("chanuka");
        list.add("gayan");
        list.add("kasun");
//        for(String str : list){
//            System.out.println(str);
//        }
//        list.forEach(System.out::println);
//        list.stream().forEach((c) -> System.out.println(c));

//        Arrays.stream(list.toArray())
//                .forEach(e->System.out.println(e));
//        for( Object arr : list.toArray()){
//            System.out.println(arr.toString());
//        }

        Arrays.stream(list.toArray(new String[0]))
                .forEach(e->System.out.println(e));
        for( Object arr : list.toArray(new String[0])){
            System.out.println(arr.toString());
        }


    }
}
