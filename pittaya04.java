public class pittaya04 {
	public static void main(String args[]) {
		int totalpit = 4;
		for (int pit=1; pit <= totalpit; pit++) {
			for (int pittaya=1; pittaya <= pit; pittaya++) { System.out.print("*"); }
			for (int pittaya=pit; pittaya >= 2; pittaya--) { System.out.print(pittaya); }
			for (int pittaya=1; pittaya <= pit; pittaya++) { System.out.print(pittaya); }
			System.out.println();
		}
	}
}