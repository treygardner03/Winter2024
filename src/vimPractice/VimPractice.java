package vimPractice;
import java.util.Scanner;

public class VimPractice {

	public static void main(String[] args) {
	int[] data = {1, 5, 3, 4 ,6, 9, 8};

	System.out.println("Enter an index: ");
	Scanner input = new Scanner(System.in);
	int index = input.nextInt();

	try { 
	System.out.println("The element is " + data[index]);
}
	catch (Exception ex) {
	
	}
	finally {
	System.out.println("This is always executed");
	}
	
	input.close();

	}
}