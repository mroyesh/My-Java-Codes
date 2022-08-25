package com.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfacePractice {

    public static void main(String[] args) {


        Function<int[], List<Integer>> arrayToList= list-> {
            List<Integer>list1= new ArrayList<>();
            for (int each : list) {
                list1.add(each);

            }
            return list1;
        };
        int[] arr= {1,2,3,4,5,6};
        System.out.println(arrayToList.apply(arr));

    }
}
