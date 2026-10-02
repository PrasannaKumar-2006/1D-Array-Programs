package swap_two_elements;

import java.util.*; 
public class Main {    
	public static void main(String[] args) {        
		Scanner sc = new Scanner(System.in);        
		int n = sc.nextInt();        
		int[] a = new int[n];        
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();        
		int pos1 = sc.nextInt(), pos2 = sc.nextInt();        
		int temp = a[pos1];        
		a[pos1] = a[pos2];        
		a[pos2] = temp;        
		for (int i = 0; i < n; i++) 
			System.out.print(a[i] + " ");    
		} 
	}