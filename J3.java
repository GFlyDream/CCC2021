//Import stuff
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
    //Initialize scanner (input reader)
		Scanner in = new Scanner(System.in);

    //Read input
		String input = in.nextLine();

    //Initialize the first digit, second digit, rest of the input and previous instruction
		int firstDigit;
		int secondDigit;
		String secondPart;
		String previousInstruction = "";

    //While loop to exit when input is 99999 (end of inputs)
		while (!input.equals("99999")) {

      //Use substring method to get first and second digit
			firstDigit = Integer.parseInt(input.substring(0, 1));
			secondDigit = Integer.parseInt(input.substring(1, 2));

      //Get rest of the input
			secondPart = input.substring(2);

      //Output the previous instructions + rest of input if sum is 0
			if (firstDigit + secondDigit == 0) {
				System.out.println(previousInstruction + secondPart);
      //Output right + rest of input if sum is even
			} else if ((firstDigit + secondDigit) % 2 == 0) {
				previousInstruction = "right ";
				System.out.println(previousInstruction + secondPart);
      //Output left + rest of input is sum is odd
			} else {
				previousInstruction = "left ";
				System.out.println(previousInstruction + secondPart);
			}

      //Define input as reading the next line of input.
			input = in.nextLine();
		}
	}
}
