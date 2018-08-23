public class pittaya29 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			System.out.print(pit);
			System.out.print("*");
			System.out.print(2+pit);
			for(int pittaya=1;pittaya<=2+pit;pittaya++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}