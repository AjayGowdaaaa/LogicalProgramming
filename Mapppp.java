package String;

import java.util.ArrayList;

public class Mapppp {
	public  static boolean sameStarChar(String str) {
		  ArrayList a = new ArrayList();
		  //Adding String to Map
		  for (int i = 0; i < str.length(); i++) {
			a.add(str.charAt(i));
		}
		 int n =  a.indexOf('*');
		  if (str.charAt(n+1) == str.charAt(n+2) ) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(sameStarChar("12*2*3*"));
	}

}
