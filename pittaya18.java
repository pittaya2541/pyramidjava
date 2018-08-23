public class pittaya18 {
	public static void main(String args[]) {
		for(int pit=1; pit<=5; pit++) {
			System.out.print (pit);
			for(int pittaya=1; pittaya<=pit; pittaya++) {
				System.out.print ("*");
			}
			System.out.print (pit);
			for(int pitty=5; pitty>=pit; pitty--) {
					System.out.print ("*");
			}
			for(int pitlet=1; pitlet<=1; pitlet++) {
				System.out.print (10-pit);
			}
			System.out.println();
		}
	}
}