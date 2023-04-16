import java.util.Arrays;

//Time Complexity- n^2(n square)
//Inplace Sorting,stable, Adaptive

public class InsertionSort {
    public static void Sorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }

    public static void main(String[] args) {
        int arr[]={20,30,10,5,7};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
