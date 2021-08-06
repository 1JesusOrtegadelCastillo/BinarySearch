package com.company;

import java.util.List;

public class BinarySearch {

    public void binarySearch(int arr[], int num){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high)/2;
            int guess = arr[mid];
            if (guess == num){
                System.out.println("Number: " + num + " ... found at position: " + mid);
                break;
            }else if(guess > num){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (low > high) {
                System.out.printf("Number: " + num + " ... not found");
            }
        }

    }

}
