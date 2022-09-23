import java.util.Scanner;
public class Latihan05 {
	
	public static void main(String[] args) {
		// creates an object of Scanner
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter your text: ");

	    // takes input from the keyboard
	    String name = input.nextLine();

	    // prints the name
	    System.out.println(name.toUpperCase());

	    // closes the scanner
	    input.close();
	  }
	}