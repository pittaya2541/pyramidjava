public class pittaya33 {
	public static void main(String args[]) {
		for(int pit=1;pit<=3;pit++) {
			for(int pittaya=-1;pittaya<=3-pit;pittaya++) {	
				System.out.print(" ");
			}
			for(int pittaya=1;pittaya<=pit;pittaya++){
				System.out.print("*");
			}
			for(int pittaya=2;pittaya<=pit;pittaya++){
				System.out.print("*");
			}
			for(int pittaya=1;pittaya<=3-pit;pittaya++) {
				
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int pit=2;pit>=1;pit--) {
			for(int pittaya=-1;pittaya<=3-pit;pittaya++) {
				System.out.print(" ");
			}
			
			for(int pittaya=1;pittaya<=pit;pittaya++){
				System.out.print("*");
			}
			
			for(int pittaya=2;pittaya<=pit;pittaya++){
				System.out.print("*");
			}
			for(int pittaya=1;pittaya<=3-pit;pittaya++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}