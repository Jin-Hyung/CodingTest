package com.test;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class CodingTest {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  for (int i=1; i<=n*2-1; i++) {
	    if (i <= n) {
  	    for (int j=1; j<=i; j++) {
  	      System.out.print("*");
  	    }
  	    for (int j=n-1; j>=i; j--) {
  	      System.out.print(" ");
  	    }
        for (int j=n-1; j>=i; j--) {
          System.out.print(" ");
        }
        for (int j=1; j<=i; j++) {
          System.out.print("*");
        }
  	    System.out.println();
	    } else {
	      for (int j=n; j>(i-n); j--) {
          System.out.print("*");
        }
        for (int j=1; j<=i-n; j++) {
          System.out.print(" ");
        }
        for (int j=1; j<=i-n; j++) {
          System.out.print(" ");
        }
        for (int j=n; j>(i-n); j--) {
          System.out.print("*");
        }
        System.out.println();
	    }
	    sc.close();
	  }
	  
	  Stack<Map<String, String>> st = new Stack<>();
	  
	}

}
