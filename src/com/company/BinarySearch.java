package com.company;

import java.util.List;

public class BinarySearch {

    public void binarySearch(int arr[], int num){
        int low = 0; // pointer starting at position 0
        int high = arr.length - 1; // pointer starting at last position

        while (low <= high){
            int mid = (low + high)/2; // middle element
            int guess = arr[mid];
            if (guess == num){ // if element has been found
                System.out.println("Number: " + num + " ... found at position: " + mid);
                break;
            }else if(guess > num){ // if number is too high
                high = mid - 1; 
            } else {
                low = mid + 1; // if number is too low 
            }
            if (low > high) { // if the element is not found
                System.out.printf("Number: " + num + " ... not found");
            }
        }

    }

}
