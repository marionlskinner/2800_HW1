//Name: Buddy Skinner
//Date: May 13 2022
//Class: COP2800

package cop2800;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter a whole number:");
	int x = userInput.nextInt();
	int y = x * 3; // multiplies whole number by three
	double z = x / 3.0; // divides whole number by three //update: changed 3 to 3.0 due to data loss.
	System.out.println("You entered: " + x);
	
	System.out.println("Multiplied by three: " + y);
		
	System.out.println("Divided by three: " + z);
	
	}

}
