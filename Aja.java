package com;

public class Aja {
	static int ab = 10;
	int b= 20;
	public static void main(String[] args) {
		Aja a = new Aja();
		a.b=200;
		a.ab=100;
		//System.out.println(a.ab);
		//System.out.println(ab);
		Aja b = new Aja();
		b.ab=20000;
		System.out.println(ab);
		System.out.println(a.ab);
		System.out.println(b.ab);
	}

}
