public class pittaya36 {
	public static void main(String args[]) {
		int pit1=1; 
		int pit2=1; 
		int pit3=1;
		for(int pit=1; pit<=3; pit++) {
			for(int pittaya1=pit1; pittaya1<=3; pittaya1++) {
				System.out.print(pittaya1);
			}
			pit1++;
			for(int pittaya2=1; pittaya2<=pit2; pittaya2++) {
				System.out.print ("*");
			}
			pit2+=2;
			for(int pittaya3=3; pittaya3>=pit3; pittaya3--) {
				System.out.print(pittaya3);
			}
			pit3++;
			System.out.println();
		}
		for (int pit4=2;pit4<=3;pit4++) {
			System.out.print(pit4);
		}
		for (int pit5=1;pit5<=3;pit5++) {
			System.out.print("*");
		}
		for (int pit6=3;pit6>=2;pit6--) {
			System.out.print(pit6);
		}
		System.out.println();
		for (int pit7=1;pit7<=3;pit7++) {
			System.out.print(pit7);
		}
		for (int pit5=1;pit5<=1;pit5++) {
			System.out.print("*");
		}
		for (int pit6=3;pit6>=1;pit6--) {
			System.out.print(pit6);
		}
	}
}