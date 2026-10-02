package count_odd_even;

import java.util.*; 
public class Main {    
	public static void main(String[] args) {        
		Scanner sc = new Scanner(System.in);        
		int n = sc.nextInt();        
		int[] a = new int[n];        
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();        
		int oc = 0, ec = 0;        
		for (int i = 0; i < n; i++) {            
			if (a[i] % 2 == 0) ec++;            
			else oc++;        
			}        
		System.out.println("Even: " + ec);        
		System.out.println("Odd: " + oc);    
		} 
	}