public class QuickSorting {
    public static void main(String[] args) {
        int arr[] = {5,3,4,6,8,7};
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        quickSorting(arr, 0, 5);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSorting(int []arr, int start, int end) {
        if(start< end){
            int pivotIdx = partition(arr, start, end);
            quickSorting(arr, start, pivotIdx - 1);
            quickSorting(arr, pivotIdx + 1, end);
        }
    }
    public static int partition(int []arr, int start, int end) {
        int pivot = arr[end];
        int j = start - 1;
        for(int i=start; i<end; i++) {
            if(arr[i]<pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        j++;
        int temp = arr[end];
        arr[end] = arr[j];
        arr[j] = temp;
        return j;
    }
}
