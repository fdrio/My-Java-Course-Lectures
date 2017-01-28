import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveSets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a short string of different letters: ");
		String s = input.nextLine();
		ArrayList<String> ss = subsets(s);
		System.out.println("Subsets of set form by letters in "+ s + " are:");
		for (String r : ss)
			System.out.println(" \"" + r + "\"");
	}

	private static ArrayList<String> subsets(String s) {
		ArrayList<String> ss = new ArrayList<>();
		if (s.length() == 0)
			ss.add(s);
		else {
			String st;
			st = s.substring(1); // remove the first element in set (first char in string)
			ArrayList<String> tSS = subsets(st);
			for (String r : tSS)
				ss.add(________);
			for (String r : tSS)
				ss.add(_________+r);
		}
		return ss;
	}
}