package String;

public class CountNumberOfWords {

	public static void main(String[] args) {
		int count=1;
		String s = "Hi hello Good Morning";
		for (int i = 0; i <s.length(); i++) {
			if (s.charAt(i) == ' ') {
				++count;
			}
			
		}
		System.out.println(count);
	}
}
