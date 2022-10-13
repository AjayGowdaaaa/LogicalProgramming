package Pattern;

public class DoubleTriangle {
	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=n; j++) {
				System.out.print(i+""+j+" ");
			} 
			System.out.println();			
		}
		System.out.println("\n");
		//Type your code
		for (int i = 1; i<=n-1; i++) {
			for (int j = 1; j<=n; j++) {
				if ((i==1&&j==1) || (i==1&&j==3)) {
					System.out.print("   ");
				} else {
					System.out.print(" * ");
				}
			} 
			System.out.println();			
		}
		for (int i = 2; i<=n; i++) {
			for (int j = 1; j<=n; j++) {
				if ((i==3&&j==1) || (i==3&&j==3)) {
					System.out.print("   ");
				} else {
					System.out.print(" * ");
				}
			} 
			System.out.println();			
		}
	}
}
