//Time COmplexity- n square
//stable, inplace, adaptive sorting

import java.util.Arrays;

public class SelectionSort {
    public static void Sort(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            int minIndex = index;

            //finding the smallest value index
            for (int j = index + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }               
            }
            //swapping the elements 
            int temp = arr[minIndex];
                    arr[minIndex] = arr[index];
                    arr[index] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={20,10,30,5,7};
        Sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
