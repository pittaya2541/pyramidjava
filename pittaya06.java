public class pittaya06 {
	public static void main(String args[]) {
		for (int pit=0;pit<=6 ;pit++ )
	{
		for (int pittaya=1;pittaya<=pit;pittaya++ ){
		System.out.print (" ");
	}
		for (int pittaya=1;pittaya<15-(pit*2)-1 ;pittaya++ ) {
			System.out.print (pittaya%2);
		}
			System.out.println();
		}
	}
}