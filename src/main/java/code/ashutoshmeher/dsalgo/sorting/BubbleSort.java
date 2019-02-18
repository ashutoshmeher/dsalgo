package code.ashutoshmeher.dsalgo.sorting;

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
