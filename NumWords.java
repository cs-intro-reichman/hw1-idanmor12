// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int numberInput = Integer.parseInt(args[0]);
		int onesDigit= numberInput % 10;
		int tensDigit= (numberInput / 10) %10;
		int hundredsDigit = (numberInput / 100);
		System.out.println(hundredsDigit + " hundreds, " + tensDigit + " tens, and " + onesDigit + " ones.");
	}
}
