package com;

class  OverLoading {
	void Add(int x, int y) {
		System.out.println(x+y);
	}
	void Add (int x) {
		System.out.println(x);
	}
	void Add(int y, int x, int z) {
		System.out.println(x+y+z);
	}

}
class OverRiding extends OverLoading{
	public void  Add(int x) {
		System.out.println("Displaying  x "+ x);
	}
	public void Add(int x, int y) {
		System.out.println("adding x and y "+ (x+y));
	}
	public void Add(int y, int x, int z) {
		System.out.println(" Adding x y and z "+(x+y+z));
	}
}




public class MLO {

	public static void main(String[] args) {
		OverRiding o = new OverRiding();
		o.Add(10, 20, 30);
	}

}
