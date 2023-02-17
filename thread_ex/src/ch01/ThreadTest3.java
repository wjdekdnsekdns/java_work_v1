package ch01;

public class ThreadTest3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Worke worker1 = new Worke();
		worker1.start();
	}
}
class Worke extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
		if(i % 10 == 0) {
			continue;
		}
		System.out.println("i : " + i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		super.run();
	}
}