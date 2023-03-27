
public class Quick_Sort_ {
	
public static void main(String[] args)
	{
		int Array[] = {9,8,7,6,5,4,3,2,1};
		quicksort(Array, 0, 8);
		for (int i = 0; i < 9 ; i++)
			{
				System.out.println(Array[i]);
			}
	}

		// TODO Auto-generated method stub
		private static void quicksort(int [] array, int leftElement, int rightElement)
		{	// One element in the array is a sorted element - return please you are done
			if (leftElement >= rightElement) // the left element is now in the right sub array or left is equal to the right
				return;
			//choose the pivot last element in our array
			int pivot = array[rightElement];
			int left = leftElement;
			int right = rightElement;
			while (left < right)
			{	// look for element that are not in their right sub array
				while (array[left] <= pivot && left < right)
				{
					left++; // move forward you don't need to do anything ,  as the element is placed correctly
				}
				while (array[right] >= pivot && left < right)
				{
					right--; // move backward you don't need to do anything , as the element is placed correctly
				}
				// once we came out of the 2 while loops that means that we encountered elements that are at the left and are > than the pivot and 
				// elements that are in the right and are < of the pivot
				// what we need to do is to swap those elements
				swap(array, left, right);
			}
			// once we come out of this outer while loop
			// it means that the left and right pointer has met each other and are standing at one element
			// what we need to do is to swap the left element with the pivot
			swap(array,left,rightElement);
			// after this part we are sure that the pivot is sorted and placed in its correct position
			// what we have to do is to recursively sort the left sub array (the array before the pivot) and the right sub array (the array after the pivot)
			// important note that the left pointer is now pointing at the index of the correctly placed pivot
			quicksort(array, leftElement, left - 1); // SORT THE LEFT ARRAY 
			quicksort(array, left + 1, rightElement); // SORT THE RIGHT ARRAY
		}
		private static void swap (int array[], int left_index, int right_index) {
			int temp = array[left_index]; 			// temp variable to hold the value of a cell
			array[left_index] = array[right_index];
			array[right_index] = temp;
		}
}

