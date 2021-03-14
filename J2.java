//Import stuff
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
CCC 2021- Junior Question 2
*/
public class Main {

	public static void main(String[] args) throws IOException {
    //Initialize the scanner (Input)
		Scanner in = new Scanner(System.in);

    //Amount of bids
		int n = Integer.parseInt(in.nextLine());

    //Winner name and winner number
		String winnerName = "";
		int winnerNum = 0;

		String name;
		int bid;

    //Loop through the amount of bids (n)
		for (int i = 0; i < n; i++) {

      //Get bid name and number
			name = in.nextLine();
			bid = Integer.parseInt(in.nextLine());

      //Determine if current bid is bigger than winner bid
			if (bid > winnerNum) {
      //Replace the old winner bid with new
				winnerNum = bid;
				winnerName = name;
			}
      
		}
    //Print out winner name
		System.out.println(winnerName);
	}
}
