import java.io.*;
import java.lang.*;
import java.util.*;

class CountingSort {
    
    static int[] countingSort(int[] inpArray, int[] auxArray) {
        int sortedArray[]=new int[inpArray.length];
        for(int i=0;i<inpArray.length;i++){
            auxArray[inpArray[i]]++;
        }
        int j=0;
        for (int i=0;i<auxArray.length;i++){
            while(auxArray[i]-- > 0){
                sortedArray[j]=i;
                j++;
            }
        }
        return sortedArray;
    }
    
    static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    
    static int getMaxValue(int[] inpArray) {
       int max=inpArray[0];
       for(int i=1;i< inpArray.length;i++){
           if(inpArray[i]>max){
               max=inpArray[i];
           }
       }
       return max;
    }
    
    public static void main (String ar[])  throws IOException {
        int arrValue[]={180,105,135,505,65,147,378,54,998,732};
        int maxValueInInputArray=getMaxValue(arrValue);
        int auxArray[]=new int[maxValueInInputArray+1]; 
        int sortedArray[]=new int[arrValue.length]; 
        sortedArray=countingSort(arrValue,auxArray);
        printArray(sortedArray);
    } 

}
/*
Time Complexity:-
Worst Case :- O(N+K) 
Average Case:- Θ(N+K) 
Best Case:- Ω(N+K)
*/
