
public class Q2 {
	
	static void sort(int[] arr) {
		for(int index=0; index<arr.length ;index++) {
			for(int j=index+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) {
					
					//swapping
					int temp = arr[index];
					arr[index] = arr[j]; 
					arr[j] = temp;
				}
			}	
		}
		
	}

	//sum
	static int arrSum(int[] arr) {

		int sum = 0;
		for(int index=0; index<arr.length ;index++) {
			sum +=arr[index];
		}
		return sum;
	}
	
	//printing array
	static void display(int[] arr) {
		
		for(int index=0; index<arr.length ;index++) {
			System.out.print(arr[index]+" ");
		}
		System.out.println();
	}

	static int[] arrCopy(int[] arr) {
		int[] arr2 = new int[arr.length];
		
		for(int index=0; index<arr.length ;index++) {
			arr2[index] = arr[index];
		}
		
		return arr2;
	}
	
	//max element of arr
	static int arrMaxElement(int[] arr) {
		int max;
		max = arr[0];
		for(int index=1; index<arr.length ;index++) {
			if(arr[index]>max)
				max = arr[index];
		}
		return max;
	}
	
	//min element of arr
	static int arrMinElement(int[] arr) {
		int min;
		min = arr[0];
		for(int index=1; index<arr.length ;index++) {
			if(arr[index]<min)
				min = arr[index];
		}
		return min;
	}
	
	//reverse arr
	static void reverseArray(int[] arr) {
		for(int index= 0 ; index < arr.length/2;index++) {
			int temp  = arr[index];
			arr[index] = arr[arr.length -index -1];
			arr[arr.length -index -1] = temp;
		}
		System.out.println("Reverse: ");
		display(arr);
	}
	
	//duplicate Array element
	static void dupicateValueInarray(int[] arr) {
		
		for(int index=1; index<arr.length ;index++) {
			
			for(int nextIndex = index +1;nextIndex < arr.length;nextIndex++) {
				
				if(arr[index] == arr[nextIndex]) {
					System.out.print(arr[index] + " ");
					break;
				}
			}
		}
	}
	
	static void dupicateInTwoArray(int[] arr,int[] arr2) {
		
		for(int index= 0; index<arr.length ;index++) {
		
			for(int index2 = 0;index2 < arr.length;index2++) {
			
				if(arr[index] == arr2[index2]) {
					System.out.print(arr[index] + " ");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {

	    System.out.println("Enter the size of first array");
	    int size = ConsoleInput.getInt();
	    int[] arr = new int[size];

	    System.out.println("Enter elements of first array:");
	    for (int index = 0; index < arr.length; index++) {
	        arr[index] = ConsoleInput.getInt();
	    }

	    System.out.println("Enter the size of second array");
	    int size2 = ConsoleInput.getInt();
	    int[] arr2 = new int[size2];

	    System.out.println("Enter elements of second array:");
	    for (int index = 0; index < arr2.length; index++) {
	        arr2[index] = ConsoleInput.getInt();
	    }

	    // Display arrays
	    System.out.println("\nFirst Array:");
	    display(arr);

	    System.out.println("Second Array:");
	    display(arr2);

	    // Sum
	    System.out.println("\nSum of first array: " + arrSum(arr));
	    System.out.println("Sum of second array: " + arrSum(arr2));

	    // Maximum
	    System.out.println("\nMaximum of first array: " + arrMaxElement(arr));
	    System.out.println("Maximum of second array: " + arrMaxElement(arr2));

	    // Minimum
	    System.out.println("Minimum of first array: " + arrMinElement(arr));
	    System.out.println("Minimum of second array: " + arrMinElement(arr2));

	    // Copy
	    int[] copy = arrCopy(arr);
	    System.out.println("\nCopied first array:");
	    display(copy);

	    // Sort
	    sort(arr);
	    sort(arr2);

	    System.out.println("\nSorted first array:");
	    display(arr);

	    System.out.println("Sorted second array:");
	    display(arr2);

	    // Reverse
	    System.out.println("\nReverse first array:");
	    reverseArray(arr);

	    System.out.println("Reverse second array:");
	    reverseArray(arr2);

	    // Duplicate elements in first array
	    System.out.println("\nDuplicate elements in first array:");
	    dupicateValueInarray(arr);
	    System.out.println();

	    // Common elements
	    System.out.println("Common elements in both arrays:");
	    dupicateInTwoArray(arr, arr2);
	    System.out.println();
	}
}


