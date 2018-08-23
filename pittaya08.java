public class pittaya08 {
	public static void main(String args[]) {
		for(int pit=1;pit<=7;pit++)
		{
		for(int pittaya=2;pittaya<=pit;pittaya++)
		{
			System.out.print(" ");
		}
		for(int pittaya=pit;pittaya<=pit;pittaya++)
		{
			System.out.print (pit);
			System.out.print (pit+1);
			System.out.print (pit+2);
		}
		for(int pittaya=1;pittaya<=(pit+1);pittaya++)
		{
			System.out.print("*");
		}
			System.out.println();
		}
	}
}