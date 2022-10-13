package String;

public class MP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]={10,20,30,40,50,60};
		int bc=0, ac=0, bl=45;
		for (int i = 0; i < n.length; i++) {
			if (n[i]<bl) {
				bc++;
			}else {
				ac++;
			}
		}
		System.out.println("Below BaseLine :"+bc);
		System.out.println("Above BaseLine :"+ac);
	}

}
