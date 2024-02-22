public class MergeSorting {
    public static void main(String[] args) {
        int arr[] = {5,3,4,6,8,7};
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        mergeSorting(arr, 0, 5);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSorting(int arr[], int start, int end){
        if(start < end){
            int mid = start + (end - start)/2;
            mergeSorting(arr, start, mid);
            mergeSorting(arr, mid+1, end);
            // merge 
            merge(arr, start, mid, end);
        }
    }
    public static void merge(int arr[], int start,int mid, int end){
        int []arr1 = new int[mid- start +1];
        int []arr2 = new int[end-mid];
        int len1 = mid-start + 1;
        int len2 = end-mid;
        for(int i=0;i<len1;i++){
            arr1[i] = arr[start+i];
        }
        for(int j=0;j<len2;j++){
            arr2[j] = arr[mid+1+j];
        }
        int i=0, j=0, k= start;
        while(i<len1&&j<len2){
            if(arr1[i]<=arr2[j]){
                arr[k++] = arr1[i++];
            }else{
                arr[k++] = arr2[j++];
            }
        }
        while(i<len1){
            arr[k++] = arr1[i++];
        }
        while(j<len2){
            arr[k++] = arr2[j++];
        }
    }
}
