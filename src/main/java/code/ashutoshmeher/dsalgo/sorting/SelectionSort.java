package code.ashutoshmeher.dsalgo.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] sort(int [] input){
        for(int i=0;i<input.length;i++){
            int idx = minIndex(i, input);
            swap(i, idx, input);
        }
        return input;
    }

    private static int minIndex(int i, int[] array){
        int minIdx = i;
        for(int k = i+1; k<array.length; k++){
            if(array[minIdx] > array[k]){
                minIdx = k;
            }
        }
        return minIdx;
    }

    private static void swap(int i, int j, int[] array){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
