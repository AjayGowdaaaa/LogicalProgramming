package Pattern;

public class Diagonal {

	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print(i + ""+j+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		//Type your code
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if (i==j || i+j==n+1 ) {
					System.out.print(" "+i+" ");
				}

				else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
}
