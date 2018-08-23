public class pittaya03 {
	public static void main(String args[])   {
		int totalpit = 4;
		for (int pit=1; pit <= totalpit; pit++) {
			System.out.print(pit + "" + (pit + 4));
			for (int pittaya=1; pittaya <= (4 + pit); pittaya++) { 
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}