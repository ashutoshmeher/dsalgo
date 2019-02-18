package code.ashutoshmeher.dsalgo.sorting;

public class InsertionSort {

    public static int[] sort(int[] input){

        for(int i=1;i<input.length;i++){

            for(int j=0;j<i;j++){
                if(input[i] < input[j]){
                    int tmp = input[i];
                    shift(j, i, input);
                    input[j] = tmp;
                }
            }
        }
        return input;
    }

    private static void shift(int from, int to, int[] input){
        for(int i=to;i>from;i--){
            input[i] = input[i-1];
        }
    }
}
