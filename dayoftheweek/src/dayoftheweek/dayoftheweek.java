package dayoftheweek;

import java.util.Scanner;
public class dayoftheweek {
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
        System.out.printf("What is your favorite day of the week?:");
        String day = scnr.nextLine();

        System.out.printf("Your favorite day of the week is %s.%n", day);
	}

	

}
