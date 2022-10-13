package String;

public class StringClassPractice {

	public String firstHalf(String str) {
		String s="";
		for(int i=0; i<=str.length()/2; i++)
		{
			s=s+str.charAt(i);
		}
		return s;
	}

	public String comboString(String a, String b) {
		if(a.length()>b.length()){
			return b+a+b;
		}
		else{
			return a+b+a;
		}
	}






	public static void main(String[] args) {
		String name = "Ajay Kumar D";
		System.out.println(name.substring(2,6));
		char a1[]= {'h','e','l','l','o'} ;
		char a2[]= {'w','o','r','l','d'};
		a1=a2;
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a2[i]);
		}
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}



	}

}
