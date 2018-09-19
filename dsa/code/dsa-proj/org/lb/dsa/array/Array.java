package org.lb.dsa.array;

import java.util.ArrayList;

public class Array {

    public void printArray(int[] array) {
        if(array.length == 0) {
            System.out.println("The array is empty!");
        }
        else {
            for(int i = 0; i < array.length; i ++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    // When you need to traverse an array, see if it would be easier to traverse from the right or traverse from the left
    // Use a separate array as the given array cannot be modified in-place
    // Traverse the array from right to left. Bind the value of the right-most element in the modified array to -1 or 0 as it does not have any more elements on its right
    // Use a variable called greatestOnTheRightSoFar to store the greatest value encountered on the right so far
    // Compare this variable with the array elements as we traverse from right to left and update this variable
    // Replace the array element in the current position with this variable value as it would hold the greatest value to the right of the current value
    // Brute force: O(n2); Optimized: O(n)
    public int[] replaceWithGreatestOnTheRight(int[] givenArray, int length) {
        int greatestOnTheRightSoFar = -1;
        int [] modifiedArray = new int[length];
        // the greatest element on the right for the right-most element in
        // the array can be -1 as a default
        modifiedArray[length-1] = -1;
        for(int i = length-2; i >=0; i--) {
            if(givenArray[i+1] > greatestOnTheRightSoFar) {
                greatestOnTheRightSoFar = givenArray[i+1];
            }
            modifiedArray[i] = greatestOnTheRightSoFar;
        }
        return modifiedArray;
    }

    // Use a variable called count to track the number of non-zero values
    // Everytime a non-zero value is encountered, it is assigned to the count-th
    // position of the modified array (in-place modification) and increment count
    // Eventually, all the non-zero values would have been counted and the count variable incremented
    // Now, the array[count] will point to the first zero position
    // From this position, until the last, assign the value zero to all the elements
    // We would have effectively moved all the zeroes to the right
    // O(n)
    public int[] pushZeroesToRightWhilePreservingOrder(int[] array, int length) {
        int count = 0;
        for(int i = 0; i < length; i++) {
            if(array[i] != 0) {
                array[count] = array[i];
                count++;
            }
        }
        for(int j = count; j < length; j++) {
            array[count] = 0;
            count++;
        }
        return array;
    }

    // ************* NOT WORKING ****************************
    // 2-pointer technique
    // Use 2 pointers i and j to traverse through the array from left to right
    // i will look for zeroes and j will look for non-zeroes
    // increment i when array[i] != 0
    // increment j when array[j] = 0
    // swap array[i] and array[j] when array[i] = 0 && array[j] != 0
    // O(n)
    public int[] pushZeroesToRightWhilePreservingOrder2pTechnique(int[] array, int length) {
        int temp;
        for(int i = 0, j = 0; i < length && j < length;) {
            System.out.println("begin-i: " + i);
            System.out.println("begin-array[i]: " + array[i]);
            System.out.println("begin-j: " + j);
            System.out.println("begin-array[j]: " + array[j]);
            if(array[i] != 0) {
                //i++;
                j++;
            }
            else if(array[j] == 0) {
                //j++;
                i++;
            }

                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                System.out.println("end-i: " + i);
                System.out.println("end-array[i]: " + array[i]);
                System.out.println("end-j: " + j);
                System.out.println("end-array[j]: " + array[j]);
                i++;
                j++;

        }
        return array;
    }

    // Overlapping pairs
    // Use two variables i and j
    // Let i start from 0, j from 1 and traverse from left to right
    // Visualize the array elements in terms of overlapping pairs
    // Have an alternating "<" and ">" relationships between consecutive pairs
    // For example - e1<e2>e3<e4>e5 where eX are elements in the array
    // e1 & e2 have a "<" relationship whereas e2 & e3 have a ">" relationship and so on
    // O(n)
    public int[] rearrangeInZigZagFashion(int[] array, int length) {
        boolean lessThanRelationship = true;
        int temp;
        //int i =0; j=1;
        for(int i = 0, j = 1; i < length && j < length;) {
            if(lessThanRelationship) {
                if(array[i] > array[j]) {
                    //swap(array[i], array[j]);
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            else {
                if(array[i] < array[j]) {
                    //swap(array[i], array[j]);
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            lessThanRelationship = !lessThanRelationship;
            i++;
            j++;
        }
        return array;
    }

    // Two approaches are possible - one using Arithmetic progression and the other using XOR
    // Arithmetic progression approach: Formula for the total of n consecutive elements = n(n+1)/2. But, this is supposed to be an array of n+1 elements if no element got missed. So, its sum should ideally be (n+1)(n+2)/2. If we subtract all the array elements from this, one-by-one, we will get to know the missing element. But this may cause an Integer overflow problem if the elements are too many
    public int findMissingElementInConsecutiveNumbersAP(int[] array, int n) {
        //int missingElement = 0;
        // total is the sum of n+1 integers
        int total = (n+1)*(n+2)/2;
        int totalOfArrayElements = 0;
        for(int i = 0; i < n; i++) {
            totalOfArrayElements = totalOfArrayElements + array[i]  ;
        }
        System.out.println("total: " + total);
        System.out.println("totalOfArrayElements: " + totalOfArrayElements);
        return total - totalOfArrayElements;
    }

    // Two approaches are possible - one using Arithmetic progression and the other using XOR
    // XOR approach: This is based on the fundamental concept that if we XOR an element with itself, it results in 0. Consider a sequence of numbers from 1 to n+1. Let the XOR of all those elements be x1. Consider the elements in the given array. Let the XOR of all these elements be x2. When we do an XOR between x1 and x2, we will know the missing element between 1 and n+1.
    public int findMissingElementInConsecutiveNumbersXOR(int[] array, int n) {
        // x1 is the starting element in the given array
        int x1 = array[0];
        // x2 is the starting element in the natural numbers sequence
        int x2 = 1;

        for(int i =1; i < n; i++) {
            x1= x1 ^ array[i];
        }
        System.out.println("x1: " + x1);
        for(int i = 2; i <= n+1; i++) {
            x2 = x2 ^ i;
        }
        System.out.println("x2: " + x2);
        return (x1 ^ x2);
    }

    // The brute force needs us to iterate through all the elements in each row
    // making the TC O(n2). This approach uses two variables i and j. i traverses over the rows from 0 downwards. For each row, j traverses over columns starting from the right-most column. j stops when it encounters a zero in the row and then i progresses. This is right, because in a sorted matrix, when you encounter a zero towards the left of the matrix, that row will not contain any more 1s to the left.
    // TC: O(r+c) where r = no. of rows and c= no. of columns
    public int findRowWithMaxNoOfOnesInA2dSortedArray(int [][] matrix, int r, int c) {
        int row_index = -1;
        int j = c-1;

        for(int i = 0; i < r; i++) {
            while(j >= 0 && matrix[i][j] == 1) {
                j--;
                row_index = i;
            }
        }
        return row_index;
    }

    // Use the Sliding window technique
    // Imagine a window with start and end indexes within the given array. The window should have zeroes at the start and end indexes as boundaries.
    // Condition: Ideally, the window should have the given number of zeroes in between (m).
    // The above condition should be used to slide the window to traverse the given array. If the no. of zeroes is less than m, we keep expanding the window (moving the end-index of window until we get the requisite no. of zeroes enclosed within the window (m in this case)). Once we meet this condition, we note down the size of the window (difference between end and start indexes of the window as this gives us an indication of no. of 1s in between). We keep sliding the window to meet the above condition over and over again until we traversethe whole array. Every time we meet the condition, we compare the size of the window with the previous one and update our largest window size so far. This is what we are interested in.
    public void findZeroesToBeFlippedToGetMaxConsecutiveOnes(int[] givenArray, int length, int m) {
        int noOfZeroesToBeFlipped = m;
        int zeroesCount = 0;

        int winStart = 0;
        int winEnd = 0;
        int winSize = 0;
        int bestStart = 0;

        while(winEnd < length) {
            //System.out.println("winStart: " + winStart);
            //System.out.println("givenArray[winStart]: " + givenArray[winStart]);

            //System.out.println("winEnd: " + winEnd);
            //System.out.println("givenArray[winEnd]: " + givenArray[winEnd]);

            //System.out.println("winSize: " + winSize);
            //System.out.println("zeroesCount: " + zeroesCount);

            if(zeroesCount <= m) {
                if(givenArray[winEnd] == 0) {
                    zeroesCount++;
                }
                winEnd++;
            }
            if(zeroesCount > m) {
                if(givenArray[winStart] == 0) {
                    zeroesCount--;
                }
                winStart++;
            }
            if((winEnd - winStart) > winSize) {
                winSize = winEnd - winStart;
                bestStart = winStart;
            }
        }
        // print elements in the chosen window
        for(int i = 0; i < winSize; i++) {
            if(givenArray[bestStart+i] == 0) {
                System.out.print(bestStart+i + " ");
            }

        }
    }

    // Use Moore's voting algorithm
    // Start with the first element. Let it be the candidate majority element. Note down its count as 1. Compare with the next element. If it is the same as the previous one, increment the count. If it is not, decrement the count. When the count comes to zero, change the candidate element to the element next to the one we just processed (not the element next to the initial candidate element). Reset the count to one. Repest this process of incrementing and decrementing the count and resetting the candidate element until you reach the end of the array. The element marked as candidate element in the end is indeed the candidate element.
    // Check if the candidate element is really occuring more than n/2 times in the array where n is the length of the array. If yes, return that as the actual majority element; otherwise return -1 to mean no majprity element exists in the array.
    public int findMajorityElementInAnArray(int[] givenArray, int length) {
        int majorityElement = givenArray[0];
        int count = 1;

        for(int i = 1; i < length; i++) {
            if(givenArray[i] == majorityElement) {
                count++;
            }
            else {
                count--;
            }
            if(count == 0) {
                majorityElement = givenArray[i];
                count = 1;
            }
        }

        if(!checkIfTheCandidateElementIsMajorityElement(givenArray, length, majorityElement)) {
            majorityElement = -1;
        }

        return majorityElement;
    }

    // This is used by "findMajorityElementInAnArray" method above
    private boolean checkIfTheCandidateElementIsMajorityElement(int[] givenArray, int length, int candidateElement) {
        int noOfOccurences = 0;
        boolean candidateElementIsMajorityElement = false;
        for(int i = 0; i < length; i++) {
            if(givenArray[i] == candidateElement) {
                noOfOccurences++;
            }
        }
        if(noOfOccurences > length/2) {
            candidateElementIsMajorityElement = true;
        }
        return candidateElementIsMajorityElement;
    }

    // Rain water trapping problem
    // Create an array called leftArray with the same number of elements as the givenArray. The elements in this leftArray are obtained as follows. Traverse the original array from the left (from index=0) and replace every element with the greatest element on the left (use the element itself if there are no greater elements on the left).
    // Create another array called rightArray with the same number of elements as the givenArray. The elements in this highArray are obtained as follows. Traverse the original array from the right and replace every element with the greatest element on the right (use the element itself if there are no greater elements on the right).
    // T.C for this O(n) but S.C is O(2n) as we are using two additional arrays (leftArray and rightArray) for the solution
    // It is possible to further optimize the space. Please see the refined implementation next.
    public int findMaxStoredWater(int[] givenArray, int length) {
        int storedWater = 0;

        int[] leftArray = new int[length];
        int[] rightArray = new int[length];

        leftArray[0] = givenArray[0];
        for(int i = 1; i < length; i++) {
            leftArray[i] = Math.max(leftArray[i-1], givenArray[i]);
        }
        System.out.println("Printling leftArray...");
        printArray(leftArray);
        System.out.println("");

        rightArray[length-1] = givenArray[length-1];
        for(int i = length-2; i >= 0; i--) {
            rightArray[i] = Math.max(rightArray[i+1], givenArray[i]);
        }
        System.out.println("Printing rightArray...");
        printArray(rightArray);
        System.out.println("");

        for(int i = 0; i < length; i++) {
            storedWater = storedWater +  Math.min(leftArray[i], rightArray[i]) - givenArray[i];
        }

        return storedWater;
    }

    // NOT WORKING
    // Alternate approach for finding the max stored water
    public int findMaxStoredWaterWithReducedSC(int[] givenArray, int length) {
        int storedWater = 0;
        int left = givenArray[0];
        int right = givenArray[length-1];

        //int[] modifiedArray = new int[length];
        //modifiedArray[0] = givenArray[0];
        //modifiedArray[length-1] = givenArray[length-1];

        for(int i = 1, j = length-2; i < length && j >= 0; i++, j--) {
            System.out.println("i: " + i);
            left = Math.max(left, givenArray[i]);
            System.out.println("left: " + left);

            System.out.println("j: " + j);
            right = Math.max(givenArray[j], right);
            System.out.println("right: " + right);
            while(i <= j) {
                storedWater = storedWater + Math.min(left, right) - givenArray[i];
            }
        }
        return storedWater;
    }

    // Yet another approach for finding the max stored water
    public int findMaxStoredWaterWithReducedSCAnotherApproach(int[] givenArray, int length) {
        int storedWater = 0;

        int left_max = 0;
        int right_max = 0;

        int left = 0;
        int right = length-1;

        while(left <= right) {
            if(givenArray[left] < givenArray[right]) {
                if(givenArray[left] > left_max) {
                    left_max = givenArray[left];
                }
                else {
                    storedWater = storedWater + left_max - givenArray[left];
                    left++;
                }
            }
            else {
                if(givenArray[right] > right_max) {
                    right_max = givenArray[right];
                }
                else {
                    storedWater = storedWater + right_max - givenArray[right];
                    right--;
                }
            }
        }
        return storedWater;
    }

    // This problem is popularly known as a Stock-trade-with-single-buy-and-sell. Assuming the given array elements are the prices of the stock on a set of days, need to find out what would be the maximum profit made (maximum profit will come when the stock is bought at a min price and sold at a max price).
    // Assume the first element is the min price. Derive max profit for the current day by deducting the min price (so-far) from the current day's price. Keep updating the max profit for every day. Also update the min price so far for every day. The max of max profit is what we are interested in.
    public int maxDiffBetweenTwoElementsInAnArray(int[] givenArray, int length) {
        int minElement = givenArray[0];
        int maxDiff = givenArray[1] - givenArray[0];

        for(int i = 0; i < length; i++) {
            if((givenArray[i] - minElement) > maxDiff) {
                maxDiff = givenArray[i] - minElement;
            }
            if(givenArray[i] < minElement) {
                minElement = givenArray[i];
            }
        }
        System.out.println("minElement: " + minElement);
        System.out.println("maxDiff: " + maxDiff);
        return maxDiff;
    }

    // An alternate method for solving the same Stock-trade-with-single-buy-and-sell problem. In this case, instead of using the min element on the left for the min price, we use max element on the right for the max price. Max difference is still the same. Keep updating the max element and the max diff as above.
    public int maxDiffBetweenTwoElementsInAnArrayAlternateOne(int[] givenArray, int length) {
        int maxElement = givenArray[length-1];
        int maxDiff = givenArray[length-1] - givenArray[length-2];

        for(int i = length-1; i >= 0; i--) {
            if((maxElement - givenArray[i]) > maxDiff) {
                maxDiff = maxElement - givenArray[i];
            }
            if(givenArray[i] > maxElement) {
                maxElement = givenArray[i];
            }
        }
        System.out.println("maxElement: " + maxElement);
        System.out.println("maxDiff: " + maxDiff);
        return maxDiff;
    }

    // NOT WORKING
    // localMin would be the first element that is smaller than its next element
    // localMax would be the element after localMin that will be greater than its next element
    public ArrayList<BuySellInterval> maxStockProfitWithMultipleBuySell(int[] givenArray, int length) {
        int localMin = 0;
        int localMax = 0;

        BuySellInterval interval;
        ArrayList<BuySellInterval> intervalList = new ArrayList<BuySellInterval>();

        for(int i = 0; i < length-1;) {
            interval = new BuySellInterval();
            if(givenArray[i] < givenArray[i+1]) {
                localMin = givenArray[i];
                interval.buyIndex = localMin;
                i++;
            }
            if(givenArray[i] > givenArray[i+1]) {
                localMax = givenArray[i];
                interval.sellIndex = localMax;
                intervalList.add(interval);
                i++;
            }
        }
        return intervalList;
    }

    public ArrayList<BuySellInterval> maxStockProfitWithMultipleBuySellG4G(int[] givenArray, int length) {
        if(length < 2) {
            return null;
        }
        int count = 0;
        ArrayList<BuySellInterval> intervalList = new ArrayList<BuySellInterval>();

        int i =0;

        while(i < length-1) {
            while(givenArray[i+1] <= givenArray[i]) {
                i++;
            }

            if(i == length-1) {
                System.out.println("Entered the i==length-1 condition check");
                break;
            }
            BuySellInterval interval = new BuySellInterval();
            interval.buyIndex = i+1;

            while(givenArray[i+1] >= givenArray[i]) {
                i++;
            }
            interval.sellIndex = i+1;
            intervalList.add(interval);
            count++;
        }
        return intervalList;
    }

}
