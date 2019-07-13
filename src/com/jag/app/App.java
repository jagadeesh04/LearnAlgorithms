package com.jag.app;

import com.jag.sort.SelectionSort;

public class App {
	public static void main(String[] args) {
		
		 int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
		
		// Bubble Sort
		/*BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(arr);*/
		 
		// Selection Sort
		 SelectionSort selectionSort = new SelectionSort();
		 selectionSort.selectionSort(arr);
		 
		System.out.println("Sorted Array: ");
		App.printArray(arr);
		
	}
	
	 /* Prints the array */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}
