public class pittaya14 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			for(int pittaya=2;pittaya<=0+pit;pittaya++) {
				System.out.print(" ");
			}
			
			for(int pittaya=pit;pittaya<=pit;pittaya++) {
				System.out.print(pit);
			}
			
			System.out.print(pit+1);
			for(int pittaya=1;pittaya<=5-pit;pittaya++){
				System.out.print("  ");
			}
			
			for(int pittaya=pit;pittaya<=pit;pittaya++) {
				System.out.print(pit+1);
			}
			
			System.out.print(pit);
			
			System.out.println();
		}
	}
}