public class pittaya05 {
	public static void main(String args[]) {
		for(int pit=1;pit<=4;pit++){
			for(int pittaya=1;pittaya<=4-pit;pittaya++){
			System.out.print(" ");
		}
		System.out.print(pit);
		for(int pittaya=2;pittaya<=pit;pittaya++){
			System.out.print("**");
		}
   			System.out.print(pit);
			System.out.println();
		}
		for(int pit=3;pit>=1;pit--){
			for(int pittaya=1;pittaya<=4-pit;pittaya++){
			System.out.print(" ");
		}
			System.out.print(pit);
			for(int pittaya=2;pittaya<=pit;pittaya++){
			System.out.print("**");
			}
   		System.out.print(pit);
		System.out.println();
		}
	}
}