package ch004;

public class Paper extends MakingBook{
 @Override
public String toString() {
	System.out.println("재료는 종이 입니다");
	return super.toString();
}

@Override
public void Making() {
	System.out.println("재료로 종이를 출력합니다");
	
}
}
