package com.kodnest.patterns.level5;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				if((i+j==4)||(j-i==2)||(i==3)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
