public class linearsearch{
    // store the value in variable
    // traverse the array
    // check whether the array element == to the value of the variablle
    // if yes then display
    public static int method1(int[] arr, int value){ //stored value in variable value
        //traversing the array
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==value){
                System.out.println("Value matched: "+arr[i]);
                return i;

            }

        }
        System.out.println("value not found");
        return -1;

    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7};
        int value=60;
        System.out.println("The value found at the index: "+method1(arr1, value));
    }
}