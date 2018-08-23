public class pittaya10 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
		for(int pittaya=1;pittaya<=5-pit;pittaya++) {
			System.out.print(" ");
		}
		for(int pittaya=1;pittaya<=pit;pittaya++){
			System.out.print(pittaya);
		}
		for(int pittaya=pit;pittaya<=pit;pittaya++){
			System.out.print(6-pit);
		}
		for(int pittaya=pit;pittaya>=1;pittaya--){
			System.out.print(pittaya);
		}
			System.out.println();
		}
	}
}