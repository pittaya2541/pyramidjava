public class pittaya01 {
	public static void main(String args[]) {
		int totalpit = 4;
		for (int pit=1; pit <= totalpit; pit++) {
			for (int pittaya=2; pittaya <= pit; pittaya++) { System.out.print(" "); }
			System.out.print(pit + "" + pit);
			for (int pittaya=totalpit; pittaya >= (pit + 1); pittaya--) { System.out.print("**"); }
			System.out.println( pit + "" + pit);
		}
	}
}