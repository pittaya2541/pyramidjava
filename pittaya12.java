public class pittaya12 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
		for(int pittaya=2;pittaya<=pit;pittaya++) {
			System.out.print(" ");
		}
		for(int pittaya=pit;pittaya<=10-pit;pittaya++){
			System.out.print(pittaya);
		}
			System.out.println();
		}
	}
}