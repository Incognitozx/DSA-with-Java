// Linear Search Class
public class LinearSearch {

    // Linear Search Method
    public int linearSearch(int[] arr, int target) {
        int n = arr.length;

        // Loop through each element to find the target
        for (int i = 0; i < n; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    // Print Method (Display search result)
    public void printSearchResult(int index, int target) {
        if (index == -1) {
            System.out.println("The target " + target + " is not found in the array.");
        } else {
            System.out.println("The target " + target + " is found at index: " + index);
        }
    }

    // Main Method
    public static void main(String[] args) {
        // Create an instance of the LinearSearch class
        LinearSearch ls = new LinearSearch();

        int[] arr = {2, 4, 0, 3, 1}; // Sample array
        int target = 2; // Target element to search for

        // Perform the search and store the result
        int resultIndex = ls.linearSearch(arr, target);

        // Print the search result
        ls.printSearchResult(resultIndex, target);
    }
}

// In Linear Search (Idea) - Traverse the array and compare each element with the target value.

// Output (if target is 3):
// The target 3 is found at index: 3

// Approach
/*
1. Traverse the array from the beginning.
2. Compare each element with the target value.
3. If a match is found, return the index of the target.
4. If no match is found after traversing, return -1.
*/

// Time & Space Complexity
/*
Worst complexity: O(n)
Average complexity: O(n)
Best complexity: O(1)
Space complexity: O(1)
*/
