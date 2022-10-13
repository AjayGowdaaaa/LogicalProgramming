
public class aj  extends Thread {

	int code =9;
	public void run() {
		this.code=7;
	}
	
	public static void main(String[] args) {
		aj a = new aj();
		a.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(a.code);
		}
	}
}
