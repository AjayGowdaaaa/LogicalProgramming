package String;

public class CodingBat {

	public static void main(String[] args) {
		
		String out= "<<>>"; 
		String word= "Yay"; 
		String o="";
		int l=out.length();
			  for (int i = 0; i < l; i++) {
				if (i%2==0) {
					o=o+word;
				}else {
					o=o+out.charAt(i);
				}
			}
			  System.out.println(o);
			  
		


	}

}
