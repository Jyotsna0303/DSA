public class SelectionSort {
    public static void main(String args[]) {

        int[] arr = new int[]{20, 10, 5, 15};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("After sorting");

        //selectionSort(arr, n);
        selectionSort2ndAttempt(arr, n); //most common approach find min and place it at the beginning of the array


    }

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


    public static void selectionSort2ndAttempt(int []arr, int n){
        //find min and place it at the beginning
        int min_index, temp;
        for (int i=0; i<n-1;i++){
            min_index=i;
          for (int j=i+1;j<n;j++) {
              if (arr[j] < arr[min_index]) {
                  min_index = j;
              }
          }
          if (i!=min_index) {
              temp = arr[i];
              arr[i] = arr[min_index];
              arr[min_index] = temp;
          }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
