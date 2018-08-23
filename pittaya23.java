public class pittaya23 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			System.out.print(pit);
			for(int pittaya=1;pittaya<=7-pit;pittaya++) {
				System.out.print("*");	
			}
			
			for(int pittaya=2;pittaya<=pit;pittaya++) {
				System.out.print(" ");	
			}
			System.out.print(pit);
			System.out.println();
		}
	}
}