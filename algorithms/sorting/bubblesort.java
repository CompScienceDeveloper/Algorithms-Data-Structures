import java.io.*;
import java.lang.*;
import java.util.*;

class BubbleSort {
    
    static void bubbleSort(int[] inpArray) {
        int size=inpArray.length;
    	for(int i=0;i<=size-1;i++){  
    	    boolean swappedAtleastOnce=false;
    	    for(int j=0;j<size-1-i;j++){ 
    		    if(inpArray[j]>inpArray[j+1] ) 
    			    swap(inpArray,j,j+1);
    			    swappedAtleastOnce=true;
            } 
            
            if(swappedAtleastOnce!=true)
                break;
            
    	    
    	} 
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
        int arrValue[]={180,105,135,505,65,166,378};
        bubbleSort(arrValue) ;
        printArray(arrValue);
    } 

}
/*
Time Complexity:-
Worst Case :- O(n^2) 
Average Case:- Θ(n^2) 
Best Case:- Ω(n)
*/
