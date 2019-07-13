package com.jag.sort;

public class BubbleSort {
	/*public void bubbleSort(int arr[]){
		int n = arr.length;
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				
				}
			}
		}
	}*/
	
	public void bubbleSort(int arr[]){
		boolean sorted = false;
		while(!sorted){
			sorted = true;
			for(int i=0; i<arr.length-1; i++){
				if(arr[i]>arr[i+1]){
					//swap
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]= temp;
					sorted = false;
				}
			}
		}
	}
}
