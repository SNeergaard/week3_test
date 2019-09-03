package com.example.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        //I could not figure out how to delete from an array this this is the best I got
        int count=0;
        int[] numberArray = {1, 2, 50, 3, 4, 5, 6, 2, 10, 20, 4, 4, 50};
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[i] == numberArray[j]) {
                    for (int k = j; k < numberArray.length - 1; k++) {
                        numberArray[k] = numberArray[k + 1];
                    }
                    count++;
                }
            }
        }
        int totalCount = (count / 2);
        for(int i = 0; i < numberArray.length - totalCount; i++){
            System.out.print(" " + numberArray[i]);
        }

    }
}
