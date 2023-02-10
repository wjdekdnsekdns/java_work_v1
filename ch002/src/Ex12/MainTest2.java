package Ex12;

public class MainTest2 {

	public static void main(String[] args) {
		Computer[] computers = new Computer[300];
		
		computers[0] = new DeskTop();
		computers[1] = new DeskTop();
		computers[2] = new MyNoteBook();

		for(int i = 0; i < computers.length; i++) {
			if(computers[i] != null) {
				computers[i].display();
				if(computers[i] instanceof MyNoteBook) {
					System.out.println("좋은 노트북을 구매 했네요");
				}
			}
		}
	}

}
