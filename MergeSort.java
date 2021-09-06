
public class MergeSort{
    public static void main(String []args){
        int [] arr={5, 20, 10, 7, 15};
        System.out.println("Before sorting");
        for(int number:arr){
            System.out.println(number);
        }
        int len=arr.length;
        mergeSort(arr,0,len-1);
        System.out.println("After sorting");
        for(int number:arr){
            System.out.println(number);
        }
    }

    public static void mergeSort(int [] arr , int left, int right){
        if (left<right){
        int mid=left +( right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1, right);
        merge(arr,left,mid,right);
        }
    }

    public static void merge(int[]arr,  int left, int mid, int right){
        
        int leftLen= mid-left+1;
        int rightLen=right-mid;
        int [] leftArr=new int [leftLen];
        int[] rightArr=new int [rightLen];
       // System.out.println("leftA"+mid);
       //copy left and right array 
        for(int i=0;i<leftLen;i++){
            leftArr[i]=arr[i+left];
           // System.out.println(leftArr[i]);
        }
      //  System.out.println("RightA");
        for (int i=0;i<rightLen;i++){
            rightArr[i]=arr[mid+1+i];
          //  System.out.println(rightArr[i]);
        }
        
        int leftCounter=0, rightCounter=0, k=left;
        
        while(leftCounter<leftLen && rightCounter<rightLen){
            if (leftArr[leftCounter]<=rightArr[rightCounter]){
                arr[k]=leftArr[leftCounter];
                
                leftCounter++;
            }
            else{
                arr[k]=rightArr[rightCounter];
               
                rightCounter++;
            }
            k++;

        }

        //copy leftover  elements
        while (leftCounter<leftLen){
            arr[k]=leftArr[leftCounter];
            leftCounter++;
            k++;
            
        }
        while (rightCounter<rightLen){
            arr[k]=rightArr[rightCounter];
            rightCounter++;
            k++;
        }

    }
    
}