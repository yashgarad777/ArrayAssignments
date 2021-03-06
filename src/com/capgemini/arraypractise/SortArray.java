package com.capgemini.arraypractise;

import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<4; i++) {
			int j = i+1;

			while(j>0 && arr[j] < arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j --;
			}
		}
		System.out.println("Sorted array is : ");
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}

	}

}