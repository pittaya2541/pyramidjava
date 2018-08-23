public class pittaya28 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			for(int pittaya=5;pittaya>=pit;pittaya--) {
				System.out.print(pittaya);
			}
			
			for(int pittaya=1;pittaya<=pit;pittaya++) {
				System.out.print("*");
			}
			
			for(int pittaya=2;pittaya<=pit;pittaya++) {
				System.out.print("*");
			}
			for(int pittaya=pit;pittaya<=5;pittaya++) {
				System.out.print(pittaya);
			}
			System.out.println();
		}
	}
}