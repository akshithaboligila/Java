package com.kodnest.arrays.level1;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter contents of array "+i);
			arr[i]=scan.nextInt();
			}
		System.out.println("Array contents are...");
		//traditional for loop
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");	
		}
		
	}
	

}
