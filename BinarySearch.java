//array needs to be sorted 
//check array and count the middle value
// timecomplexity is (log n)

public class BinarySearch {
    static int counter = 1;

    // Normal method
    public static int Search(int start, int end, int[] arr, int target) {
        while (start <= end) {
            int mid = start + end / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
            counter++;
        }
        return -1;
    }

    // Binary Search using recurrsive method
    public static int Recurrsion(int start, int end, int[] arr, int target) {
        while (start <= end) {
            int mid = start + end / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return Recurrsion(start, mid - 1, arr, target);
            } else {
                return Recurrsion(mid + 1, end, arr, target);

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int value = 2;
        System.out.println("Inder value is: " + Search(0, arr.length, arr, value));
        System.out.println("Iterations are " + counter);
        System.out.println("Inder value is: " + Recurrsion(0, arr.length, arr, value));

    }
}