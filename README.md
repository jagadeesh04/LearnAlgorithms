# LearnAlgorithms
This is for my practice and notes to excel in Algorithms

## Sorting Alogorithms:

1. Bubble Sort: 
	* Definition: The sorting is done by repeatedly swapping the adjacent elements.
	* Time Complexity: O(n2) 
	* When it is good: O(n) for nearly sorted data
	* When it is bad:reversing the order
	
	```java
	//Implementation 1:
	public void bubbleSort(int arr[]){
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
	}
	
	//Implementation 2:
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
	```
2. Selection Sort:
	* Definition: The sorting is done by selecting the smallest element and placing it in the first
	* Time Complexity: O(n2) 
	* When it is good: None
	* When it is bad: Never Use
	
	```java
	public void selectionSort(int arr[]){
		for(int i=0;i<arr.length;i++){
			int min = arr[i];
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
	```
