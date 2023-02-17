package ch04;

//T 눈 Material 를 상속받은 녀석으로 제한
public class GenericPrint <T extends Material>{

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	@Override
	public String toString() {
		
		return material.toString();
	}
	
}
