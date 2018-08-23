public class pittaya16 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			for(int pittaya=pit;pittaya>=1;pittaya--){
				System.out.print(pittaya);
			}
			for(int pittaya=1;pittaya<=5-pit;pittaya++){
				System.out.print("  ");
			}
			for(int pittaya=pit;pittaya>=1;pittaya--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}