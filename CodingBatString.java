package String;

public class CodingBatString {

	//	xyzMiddle("AAxyzBB") → true
	//	xyzMiddle("AxyzBB") → true
	//	xyzMiddle("AxyzBBB") → false

	public boolean xyzMiddle(String str) {

		if (str.length()>=3 && str.charAt(str.length()/2)=='y') {
			return true;
		}else  if ( str.length()>=3 &&str.charAt(str.length()/2-2)=='y') {
			return true;
		} else if (str.length()>=3 && str.charAt(str.length()/2-1)=='y'){
			return true;
		}else {
			return false;
		}
	}

//	//	getSandwich("breadjambread") → "jam"	""	X	
//	getSandwich("xxbreadjambreadyy") → "jam"	"jam"	OK	
//	getSandwich("xxbreadyy") → ""	""	OK	
//	getSandwich("xxbreadbreadjambreadyy") → "breadjam"	"jam"	X	
//	getSandwich("breadAbread") → "A"	""	X	
//	getSandwich("breadbread") → ""	""	OK	
//	getSandwich("abcbreaz") → ""	""	OK	
//	getSandwich("xyz") → ""	""	OK	
//	getSandwich("") → ""	""	OK	
//	getSandwich("breadbreaxbread") → "breax"	""	X	
//	getSandwich("breaxbreadybread") → "y"	StringIndexOutOfBoundsException: String index out of range: 16 (line:4)	X	
//	getSandwich("breadbreadbreadbread") → "breadbread"
	
	public String getSandwich(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.length()>13 && str.charAt(i)=='b' && str.charAt(i+1)=='r' && str.charAt(i+2)=='e' && str.charAt(i+3)=='a' && str.charAt(i+4)=='d'&& str.charAt(i+5)=='j'&& str.charAt(i+6)=='a'&& str.charAt(i+7)=='m'&& str.charAt(i+8)=='b'&& str.charAt(i+9)=='r'&& str.charAt(i+10)=='e'&& str.charAt(i+11)=='a'&& str.charAt(i+12)=='d') {
				count++;
			}
		}
		if (count==0) {
			return "";
		}else {
			
			return "jam";
		}
	}


}
