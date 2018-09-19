package org.lb.dsa.array;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        //testReplaceWithGreatestOnTheRight();
        //testPushZeroesToRightWhilePreservingOrder();
        //testPushZeroesToRightWhilePreservingOrder2pTechnique();
        //testRearrangeInZigZagFashion();
        //testFindMissingElementInConsecutiveNumbersAP();
        //testFindMissingElementInConsecutiveNumbersXOR();
        //testFindRowWithMaxNoOfOnesInA2dSortedArray();
        //testFindZeroesToBeFlippedToGetMaxConsecutiveOnes();
        //testFindMajorityElementInAnArray();
        //testFindMaxStoredWater();
        //testFindMaxStoredWaterWithReducedSC();
        //testFindMaxStoredWaterWithReducedSCAnotherApproach();
        //testMaxDiffBetweenTwoElementsInAnArray();
        testMaxDiffBetweenTwoElementsInAnArrayAlternateOne();
        //testMaxStockProfitWithMultipleBuySell();
        //testMaxStockProfitWithMultipleBuySellG4G();

    }

    public static void testReplaceWithGreatestOnTheRight() {
        Array array = new Array();
        int[] origArray = {16, 17, 4, 3, 5, 2};
        System.out.println("Printing original array...");
        array.printArray(origArray);

        int[] modifiedArray = array.replaceWithGreatestOnTheRight(origArray, origArray.length);
        System.out.println("Printing modified array...");
        array.printArray(modifiedArray);
    }

    public static void testPushZeroesToRightWhilePreservingOrder() {
        Array array = new Array();
        int[] origArray = {1, 0, 2, 0, 0, 3, 4, 5, 0};
        System.out.println("Printing original array...");
        array.printArray(origArray);

        int[] modifiedArray = array.pushZeroesToRightWhilePreservingOrder(origArray, origArray.length);
        System.out.println("Printing modified array...");
        array.printArray(modifiedArray);
    }

    public static void testPushZeroesToRightWhilePreservingOrder2pTechnique() {
        Array array = new Array();
        //int[] origArray = {1, 0, 2, 0, 0, 3, 4, 5, 0};
        int[] origArray = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Printing original array...");
        array.printArray(origArray);

        int[] modifiedArray = array.pushZeroesToRightWhilePreservingOrder2pTechnique(origArray, origArray.length);
        System.out.println("Printing modified array...");
        array.printArray(modifiedArray);
    }

    public static void testRearrangeInZigZagFashion() {
        Array array = new Array();

        int[] origArray = {4, 3, 7, 8, 6, 2, 1};
        System.out.println("Printing original array...");
        array.printArray(origArray);

        int[] modifiedArray = array.rearrangeInZigZagFashion(origArray, origArray.length);
        System.out.println("Printing modified array...");
        array.printArray(modifiedArray);
    }

    public static void testFindMissingElementInConsecutiveNumbersAP() {
        Array array = new Array();

        int[] origArray = {1, 4, 5, 3, 6, 8, 7};
        System.out.println("Printing original array...");
        array.printArray(origArray);

        int missingElement = array.findMissingElementInConsecutiveNumbersAP(origArray, origArray.length);
        System.out.println("Printing missing element... " + missingElement);
    }

    public static void testFindMissingElementInConsecutiveNumbersXOR() {
        Array array = new Array();

        int[] origArray = {1, 2, 4, 5, 3, 7};
        System.out.println("Printing original array...");
        array.printArray(origArray);

        int missingElement = array.findMissingElementInConsecutiveNumbersXOR(origArray, origArray.length);
        System.out.println("Printing missing element... " + missingElement);
    }

    public static void testFindRowWithMaxNoOfOnesInA2dSortedArray() {
        Array array = new Array();

        int[][] matrix = {{0, 1, 1, 1}, {0, 1, 1, 1}, {0, 0, 1, 1}, {0, 0, 1, 1}};
        int r = 4;
        int c = 4;

        int row_with_max_ones = array.findRowWithMaxNoOfOnesInA2dSortedArray(matrix, r, c);
        System.out.println("Index of row that has max. no. of 1s: " + row_with_max_ones);
    }

    public static void  testFindZeroesToBeFlippedToGetMaxConsecutiveOnes() {
        Array array = new Array();

        //int[] origArray = {0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0};
        int[] origArray = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
        System.out.println("Printing original array...");
        array.printArray(origArray);
        System.out.println("");

        int m = 2;
        array.findZeroesToBeFlippedToGetMaxConsecutiveOnes(origArray, origArray.length, m);
        System.out.println("");
    }

    public static void testFindMajorityElementInAnArray() {
        Array array = new Array();

        //int[] givenArray = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        //int[] givenArray = {1, 3, 3, 1, 2};
        int[] givenArray = {1, 1, 2, 1, 3, 5, 1};
        System.out.println("Printing given array...");
        array.printArray(givenArray);
        System.out.println("");

        int majorityElement = array.findMajorityElementInAnArray(givenArray, givenArray.length);
        System.out.println("Majority element is: " + majorityElement);
        System.out.println("");
    }

    public static void testFindMaxStoredWater() {
        Array array = new Array();

        //int[] givenArray = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] givenArray = {1, 3, 6, 2, 0, 7};
        System.out.println("Printing given array...");
        array.printArray(givenArray);
        System.out.println("");

        int storedWater = array.findMaxStoredWater(givenArray, givenArray.length);
        System.out.println("Stored water is: " + storedWater);
        System.out.println("");
    }

    public static void testFindMaxStoredWaterWithReducedSC() {
        Array array = new Array();

        int[] givenArray = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        //int[] givenArray = {1, 3, 6, 2, 0, 7};
        System.out.println("Printing given array...");
        array.printArray(givenArray);
        System.out.println("");

        int storedWater = array.findMaxStoredWaterWithReducedSC(givenArray, givenArray.length);
        System.out.println("Stored water is: " + storedWater);
        System.out.println("");
    }

    public static void testFindMaxStoredWaterWithReducedSCAnotherApproach() {
        Array array = new Array();

        int[] givenArray = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        //int[] givenArray = {1, 3, 6, 2, 0, 7};
        System.out.println("Printing given array...");
        array.printArray(givenArray);
        System.out.println("");

        int storedWater = array.findMaxStoredWaterWithReducedSCAnotherApproach(givenArray, givenArray.length);
        System.out.println("Stored water is: " + storedWater);
        System.out.println("");
    }

    public static void testMaxDiffBetweenTwoElementsInAnArray() {
        Array array = new Array();

        //int[] givenArray = {1, 2, 90, 10, 110};
        int[] givenArray = {80, 2, 6, 3, 100, 8};
        System.out.println("Printing given array...");
        array.printArray(givenArray);
        System.out.println("");

        int maxDiff = array.maxDiffBetweenTwoElementsInAnArray(givenArray, givenArray.length);
        System.out.println("Max difference is: " + maxDiff);
        System.out.println("");
    }

    public static void testMaxDiffBetweenTwoElementsInAnArrayAlternateOne() {
        Array array = new Array();

        int[] givenArray = {1, 2, 90, 10, 110};
        //int[] givenArray = {80, 2, 6, 3, 100, 8};
        System.out.println("Printing given array...");
        array.printArray(givenArray);
        System.out.println("");

        int maxDiff = array.maxDiffBetweenTwoElementsInAnArrayAlternateOne(givenArray, givenArray.length);
        System.out.println("Max difference is: " + maxDiff);
        System.out.println("");
    }

    public static void testMaxStockProfitWithMultipleBuySell() {
        Array array = new Array();

        int[] givenArray = {100, 180, 260, 310, 40, 535, 695};
        System.out.println("Printing the given array...");
        array.printArray(givenArray);
        System.out.println("");

        ArrayList<BuySellInterval> intervalList = array.maxStockProfitWithMultipleBuySell(givenArray, givenArray.length);

        for(BuySellInterval buySellInt : intervalList) {
            System.out.println("buyDay: " + buySellInt.buyIndex);
            System.out.println("sellDay: " + buySellInt.sellIndex);
        }
    }

    public static void testMaxStockProfitWithMultipleBuySellG4G() {
        Array array = new Array();

        int[] givenArray = {100, 180, 260, 310, 40, 535, 695};
        System.out.println("Printing the given array...");
        array.printArray(givenArray);
        System.out.println("");

        ArrayList<BuySellInterval> intervalList = array.maxStockProfitWithMultipleBuySellG4G(givenArray, givenArray.length);

        for(BuySellInterval buySellInt : intervalList) {
            System.out.println("buyDay: " + buySellInt.buyIndex);
            System.out.println("sellDay: " + buySellInt.sellIndex);
        }
    }
}
