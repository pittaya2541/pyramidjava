public class pittaya21 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			for(int pittaya=pit;pittaya<=7;pittaya++){
				System.out.print("*");
			}
			
			System.out.print(pit);
			for(int pittaya=1;pittaya<=pit;pittaya++){
				System.out.print("*");
			}
			for(int pittaya=pit;pittaya<=pit;pittaya++){
				System.out.print(8-pit);
			}
			System.out.println();
		}
	}
}