public class InsertionSorting {
    public static void insertionShorting(int []arr, int n) {
         // assume element at index 0 is sorted
         for(int i=1;i<arr.length-1;i++) {
            for(int j=0;j<i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }
    }
}
// [2, 5, 9, 1, 5, 6]
