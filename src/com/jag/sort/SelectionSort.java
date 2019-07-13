package com.jag.sort;

public class SelectionSort {

	public void selectionSort(int arr[]){
		for(int i=0; i<arr.length; i++){
			int min = arr[i];  //assuming 1st element is minimum
			int minId = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<min){
					min = arr[j];
					minId = j;
				}
			}
			//swap ith element with min 
			int temp = arr[i];
			arr[i] = min;
			arr[minId] = temp;
		}
	}
	
}
