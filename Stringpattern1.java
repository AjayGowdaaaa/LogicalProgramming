package String;

public class Stringpattern1 {
	public static void main(String[] args) {
		String s1= "hello", s2="";
		for (int i = 0; i <=s1.length()-2; i++) {
			for (int j = i; j <i+1; j++) {
				s2+=s1.charAt(j);
			}
			System.out.println(s2);
		}
	}
}
