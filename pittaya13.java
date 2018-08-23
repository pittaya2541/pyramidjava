public class pittaya13 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			for(int pittaya=2;pittaya<=pit;pittaya++) {
				System.out.print("  ");
			}
			for(int pittaya=11;pittaya>=11;pittaya--){
				System.out.print(pittaya-pit-pit);
			}
			for(int pittaya=10;pittaya>=6+pit;pittaya--){
				System.out.print(pittaya-pit-pit);
			}
			for(int pittaya=5;pittaya>=1+pit;pittaya--){
				System.out.print(pittaya-pit);
			}
				System.out.println();
		}
	}
}