public class pittaya22 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			System.out.print("*");
			for(int pittaya=2;pittaya<=pit;pittaya++) {
				System.out.print(" ");	
			}
			
			for(int pittaya=0;pittaya<=5-pit;pittaya++){
				System.out.print(pit);
			}
			for(int pittaya=0;pittaya<=4-pit;pittaya++){
				System.out.print(pit);
			}
			for(int pittaya=2;pittaya<=pit;pittaya++) {
				System.out.print(" ");	
			}
			System.out.print("*");
			System.out.println();
		}
	}
}