public class pittaya19 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			for(int pittaya=pit;pittaya<=pit;pittaya++) {
				System.out.print(pittaya);	
			}
			
			for(int pittaya=pit;pittaya<=9;pittaya++){
				System.out.print("*");
			}
			for(int pittaya=2;pittaya<=pit;pittaya++){
				System.out.print(" ");
			}
			
			for(int pittaya=pit;pittaya<=pit;pittaya++){
				System.out.print(6-pit);
			}
			System.out.println();
		}
	}
}