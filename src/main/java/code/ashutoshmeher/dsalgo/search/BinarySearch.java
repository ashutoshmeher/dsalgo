package code.ashutoshmeher.dsalgo.search;

public class BinarySearch {

    public static int search(int[] arr, int key){
        return search(arr, key, 0, arr.length-1);
    }

    private static int search(int arr[], int key, int l, int r){

        if(r-l >= 0) {
            int mid = (l + r) / 2;

            if (arr[mid] == key)
                return mid;

            if (key > arr[mid]) {
                return search(arr, key, mid + 1, r);
            } else if (key < arr[mid]) {
                return search(arr, key, l, mid-1);
            }
        }
        return -1;
    }

}