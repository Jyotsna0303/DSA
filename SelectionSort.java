public class SelectionSort {
    
    public static void main(String args[]) {

        int[] arr = new int[]{20, 10, 5, 15};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("After sorting");

        selectionSort(arr, n);

    }
// timecomplexity= O(n^2) in every case worst, best and all.
//space = O(1)
    public static void selectionSort(int[] arr, int n) {
        // find the max and then swap with the last position.
        // So we are finding max and keeping the element at correct position
        int newLength = n, max = 0, index = 0;
        while (newLength > 1) {
            max = arr[0];
            index = 0;
            for (int i = 1; i < newLength; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    index = i;
                }
            }
            //System.out.println("max"+max);
            arr[index] = arr[newLength - 1];
            arr[newLength - 1] = max;

            newLength--;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
