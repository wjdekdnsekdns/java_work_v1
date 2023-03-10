package maple_story;

public interface Move {
	
	void left();
	void right();
	default public void up() {};
	default public void down() {};
	default public void jump() {};
	default public void attackLeft() {};
	default public void attackRight() {};
	void fall();
}
