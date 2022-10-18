package com.loops;

import java.util.Arrays;
import java.util.List;

public class NestedLoopOptimize {
    public static void main(String[] args) {
        int counter = 0;
        List<Integer> list = Arrays.asList(1,2,3,4);

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(i==j){
                    continue;
                }
                counter++;
                System.out.println("Actual values :"+ i +" : " + j + " -counter: "+ counter);
            }
        }

        counter = 0;
        for(int i=0;i<list.size()-1;i++){

            for(int j=i+1;j<list.size();j++){
                counter++;
                System.out.println("Actual values :"+ i +" : " + j + " -counter: "+ counter);
            }
        }

//        counter = 0;
//        for(int i=0;i<list.size();i++){
//
//            for(int j=i;j<list.size();j++){
//                counter++;
//                System.out.println("Actual values :"+ i +" : " + j + "counter: "+ counter);
//            }
//        }
    }
}
