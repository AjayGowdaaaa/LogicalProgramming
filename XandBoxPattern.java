package Pattern;

public class XandBoxPattern {
	public static void main(String[] args) {
		int n=9;
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=n; j++) {
				System.out.print(i+""+j+" ");
			} 
			System.out.println();			
		}
		System.out.println("\n");
		//Type your code here
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=n; j++) {
				if (i==n || j==n || i==1 ||j==1|| i==j || i+j==n+1 ) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			} 
			System.out.println();			
		}
		
	}

}
