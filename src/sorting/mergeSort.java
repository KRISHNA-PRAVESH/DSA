package sorting;

public class mergeSort {
    static void mergeSort(int[] arr,int l,int r){
        if(l<r){
            int mid = l+(r-l)/2;
            //splitting the array into two halves, until it cannot be splitted
            //recursively calling this function to split

            mergeSort(arr,l,mid); //left half
            mergeSort(arr,mid+1,r); //right half

            //merging the array
            merge(arr,l,mid,r);

        }
    }

    //merging
    static void merge(int[] arr,int l, int m, int r){
        //calculating the sizes of two halves of the array

        int n1 = m-l+1;    // say the original array has 7 elements so the split up would be 4 and 3
                           // m = 3,l = 0: n1 = 3-0+1 -> 4
        int n2= r - m;     // r = 6 (0-indexed array), n2 = 6-3 -> 3

        //creating two arrays
        int[] left = new int[n1];
        int[] right = new int[n2];
        //storing the array elements in two separate arrays
        for(int i=0;i<n1;i++){
            left[i] = arr[l+i]; //because l is not always 0 right so l+i,
        }
        for(int i=0;i<n2;i++){
            right[i] = arr[m+1+i]; // m+1 because jump to the next element of the middle element in the original array
        }

        //storing into the original array in sorted order
        int i=0,j=0;

        int k=l; // most important ! , start from the beginning of the current array that is left, it's not always 0 so k=0 is wrong
        while(i<n1 && j<n2){
            //add the element which is currently lesser
            if(left[i]<right[j]){  // change this to '>' to sort in descending order
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        //adding the remaining elements if any
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
        //so now the array is merged in a sorted order.

    }
    public static void main(String args[]){
        int[] arr = {6,3,2,1,4,5};
        System.out.println("Before Sorting: ");
        for(int i:arr) System.out.print(i+" ");
        mergeSort(arr,0,arr.length-1);
        System.out.println("\nAfter Sorting");
        for(int i:arr) System.out.print(i+" ");



    }
}
