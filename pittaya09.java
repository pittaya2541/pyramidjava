public class pittaya09 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
		for(int pittaya=3;pittaya<=1+pit;pittaya++) {
			System.out.print(" ");
		}
		for(int pittaya=0;pittaya<=5-pit;pittaya++){
			System.out.print(pit);
		}
		for(int pittaya=0;pittaya<=4-pit;pittaya++){
			System.out.print(pit);
		}
			System.out.println();
		}
	}
}