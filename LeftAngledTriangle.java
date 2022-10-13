package Pattern;

public class LeftAngledTriangle {
	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print(i+""+j+ " ");
			}
			System.out.println();
		}
		System.out.println("\n");
		//Type your code here
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if (i<=j) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		
	}

}
