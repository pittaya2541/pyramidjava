public class pittaya20 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			for(int pittaya=1;pittaya<=pit;pittaya++) {
				System.out.print(pit);	
			}
			for(int pittaya=1;pittaya<=pit;pittaya++) {
				System.out.print("*");	
			}
			for(int pittaya=1;pittaya<=pit;pittaya++) {
				System.out.print(pit);	
			}
			System.out.println();
		}
	}
}