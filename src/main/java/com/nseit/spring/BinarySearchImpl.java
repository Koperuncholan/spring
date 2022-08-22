package com.nseit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlg QuickSort;


    public int binarySearch(int[] numbers, int numberToSearch){
        int[] sortedNumbers = QuickSort.sort(numbers);
        System.out.println(QuickSort);
        return 12;
    }
}
