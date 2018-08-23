public class pittaya32 {
	public static void main(String args[]) {
		for(int pit=1;pit<=5;pit++) {
			for(int pittaya=1;pittaya<=8-pit;pittaya++) {
				System.out.print(pittaya);	
			}
			for(int pittaya=1;pittaya<=2+pit;pittaya++) {
				System.out.print("*");	
			}
			
			System.out.print(pit+2);
			System.out.println();
		}
	}
}