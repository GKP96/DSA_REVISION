public class SelectionShorting {
    public static void selectionShorting(int []arr, int n) {
        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(arr[j] <= min){
                    int temp = arr[j];
                    arr[j] = min;
                    min = temp;
                }
            }
            arr[i] = min;
        }
    }
}
