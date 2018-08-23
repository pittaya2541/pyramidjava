public class pittaya07 {
	public static void main(String args[]) {
		int totalpit = 7;
		for(int pit=1; pit <= totalpit; pit++) {
		for(int pittaya=1;pittaya <= totalpit - pit + 1 ; pittaya++) {
		System.out.print (" "); }
		for(int pittaya=1; pittaya <=pit ; pittaya++) {
		System.out.print (pittaya) ; }
		System.out.print (pit) ;
		for(int pittaya=pit; pittaya >= 1 ; pittaya--) {
		System.out.print (pittaya) ; }
		System.out.println();
		}
	}
}