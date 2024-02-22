
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 5, 4, 8, 9};
        // ___________BUBBLE SHORT ______________
        // BubbleShorting obj = new BubbleShorting();
        // System.out.println("Before Bubble Shorting \n");
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        // obj.bubbleShorting(arr, arr.length);
        // System.out.println("\nAfter BubbleShorting ... \n");
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }

        // ________SELECTION SHORTING________
        // SelectionShorting obj = new SelectionShorting();
        // System.out.println("Before Selection Shorting \n");
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        // obj.selectionShorting(arr, arr.length);
        // System.out.println("\nAfter selection ... \n");
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        
        // ________INSERTION SHORTING________
        InsertionSorting obj = new InsertionSorting();
        System.out.println("Before Insertion Shorting \n");
        for(int i:arr){
            System.out.print(i+" ");
        }
        obj.insertionShorting(arr, arr.length);
        System.out.println("\nAfter Insertion sorting  ... \n");
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}