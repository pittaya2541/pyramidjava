public class pittaya31 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			for(int pittaya=pit;pittaya<=5;pittaya++) {
				System.out.print(pit);	
			}
			for(int pittaya=2;pittaya<=pit;pittaya++) {
				System.out.print("  ");
			}
			for(int pittaya=0;pittaya<=5-pit;pittaya++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}