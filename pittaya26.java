public class pittaya26 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			for(int pittaya=0;pittaya<=5-pit;pittaya++) {
				System.out.print(pit);	
			}
			
			for(int pittaya=1;pittaya<=pit;pittaya++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}