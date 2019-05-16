import java.io.*;
import java.lang.*;
import java.util.*;

class MergeSort {
    
    static void mergeSort(int[] inpArray, int start,int last) {
        if(start<last){
            int mid = (start+last)/2;
            mergeSort(inpArray,start,mid);
            mergeSort(inpArray,mid+1,last);
            merge(inpArray,start,mid,last);        
        }
    }
    
    static void merge(int[] inpArray,int start, int mid, int last){
        int leftSize=mid-start+1;
        int rightSize=last-mid;
        
        int leftArray[]=new int[leftSize+1];
        int rightArray[]=new int[rightSize+1];
        // last element  of both left and right array is initialized to infinity
         leftArray[leftSize]= Integer.MAX_VALUE; 
         rightArray[rightSize]=Integer.MAX_VALUE; 
        
        for(int i=0;i<leftSize;i++){
            leftArray[i]=inpArray[start+i];
        }
         for(int j=0;j<rightSize;j++){
            rightArray[j]=inpArray[mid+1+j];
        } 
        
        int i=0,j=0,k=start;
        while(k<=last){
            if(leftArray[i]<=rightArray[j]){
                inpArray[k]=leftArray[i];
                i++;
            }
            else if(rightArray[j]<leftArray[i]){
                inpArray[k]=rightArray[j];
                j++;
            }
            k++;    
        }
    }
    
    static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    
    public static void main (String ar[])  throws IOException {
        int arrValue[]={180,105,135,505,65,147,378};
        mergeSort(arrValue,0,arrValue.length-1) ;
        printArray(arrValue);
    } 

}
/*
Time Complexity:-
Worst Case :- O(N log N) 
Average Case:- Θ(N log N) 
Best Case:- Ω(N log N)
*/
