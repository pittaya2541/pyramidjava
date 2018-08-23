public class pittaya02 {
	public static void main(String args[]) {
		int totalpit = 4;
		for (int pit=1; pit <= totalpit; pit++) {
			for (int pittaya=pit; pittaya <= (pit+2); pittaya++) { System.out.print(pittaya); }
			for (int pittaya=1; pittaya <= (2+pit); pittaya++) { System.out.print("*"); }
			System.out.println();
		}
	}
}