package ch07;

public class MainTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("James", 5000);
		Student student2 = new Student("Tomas", 10_000);

		Bus bus1 = new Bus(100);
		Subway subway1 = new Subway(1);
		
		student1.takeBus();
		student1.showInfo();
		bus1.showInfo();

		student2.takeSubway();
		student2.showInfo();
		subway1.showInfo();
	}

}
