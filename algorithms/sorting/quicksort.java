import java.io.*;
import java.lang.*;
import java.util.*;

class QuickSort {
    
    static void quickSort(int[] inpArray, int start,int end) {
        if(start<end){
            int sortedPositionOfPivot=partition(inpArray,start,end);  
            quickSort(inpArray,start,sortedPositionOfPivot-1);       // placing the pivot to it's correct sorted position
            quickSort(inpArray,sortedPositionOfPivot+1,end);         // applying sorting to all other elements  except the selected pivot as it is in correct sorted position
        }
    }
    
    static int partition(int inpArray[],int start,int end){
        int pivot=end;
        int i=start-1;
        //omitting last element as we have selected it as pivot
        for(int j=start;j<end;j++){ 
            if(inpArray[j]<inpArray[pivot]){
                i++;
                swap(inpArray,i,j);
            }
        }
        i++;
        swap(inpArray,i,pivot);
        return i;
    }
    
    static void swap (int[] inpArray, int indexSwap1, int indexSwap2) {
        int temp =inpArray[indexSwap1];
        inpArray[indexSwap1]= inpArray[indexSwap2] ;
        inpArray[indexSwap2]=temp;
    } 
    
    static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    
    public static void main (String ar[])  throws IOException {
        int arrValue[]={180,105,135,505,65,147,378,54,998,732};
        quickSort(arrValue,0,arrValue.length-1) ;
        printArray(arrValue);
    } 

}
/*
Time Complexity:-
Worst Case :- O(N^2) 
Average Case:- Θ(N log N) 
Best Case:- Ω(N log N)
*/
