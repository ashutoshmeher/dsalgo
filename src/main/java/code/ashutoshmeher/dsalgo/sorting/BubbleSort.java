package code.ashutoshmeher.dsalgo.sorting;

/**
 * BUBBLE SORT
 * This algorithm sorts an array by repeatedly swapping adjacent elements if they are in incorrect order.
 * Time Complexity:  O(n^2). Runs for O(n^2) even for a sorted array.
 * Best Case Time Complexity: O(n)
 * Space Complexity: O(1)
 * Stable: Yes
 *
 * NOTE: Used to sort an almost sorted array in linear time complexity.
 */
public class BubbleSort {

    public static int[] sort(int [] input){

        if(input.length < 2){
            return input;
        }

        boolean swap = false;
        for(int i=0;i<input.length;i++){

            for(int j=1; j<input.length;j++) {
                if (input[j - 1] > input[j]) {
                    swap = true;
                    int tmp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = tmp;
                }
            }
            if(!swap){
                break;
            }
            swap = false;
        }

        return input;
    }
}
