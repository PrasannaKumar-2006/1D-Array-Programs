package divisible_3;

import java.util.*; 
public class divisible {    
	public static void main(String[] args) {        
		Scanner sc = new Scanner(System.in);        
		int n = sc.nextInt();        
		int[] a = new int[n];        
		for (int i = 0; i < n; i++) a[i] = sc.nextInt();        
		for (int i = 0; i < n; i++) {            
			if (a[i] % 3 == 0) System.out.print(a[i] + " ");        
			}    
		} 
	}