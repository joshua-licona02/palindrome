package cis.vmi.edu;

import java.util.Scanner;

public class Project2Q1 {

	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String palindString=input.nextLine();
		
boolean pal=true;
		
		int low=0; 
		int high=palindString.length()-1; 
		
		while(low<high) {
			if(palindString.charAt(low)!=palindString.charAt(high)) {
				pal=false;
				break;
			}
			low++;
			high--;
		}
		
		System.out.println("Is it a palindrome? "+pal);
	}
}
