// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);  

		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c)); 
		int middle = (a + b + c - min - max);

		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + middle + " " + max);
	}
}
