package com.capgemini.arraypractise;
import java.util.Scanner;
public class AverageOfArray {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		double avg;
		int sum=0;
		
		System.out.println("Enter 5 elements");
		
		for(int i=0; i<5; i++) {
			intArray[i] = sc.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			sum += intArray[i];
		}
		
		avg = sum/5;
		
		System.out.println("average is : "+avg);
	}

}
