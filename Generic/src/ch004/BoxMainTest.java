package ch004;

public class BoxMainTest {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.put("안녕 반가워");
		System.out.println(box.isEmpty());
		System.out.println("-----------------------");
		String msg = box.take();
		System.out.println("msg : " + msg);
		System.out.println(box.isEmpty());
	}
}
