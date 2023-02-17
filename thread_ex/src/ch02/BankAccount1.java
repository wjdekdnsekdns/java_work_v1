//package ch02;
//
//import java.util.Currency;
//
//public class BankAccount1 {
//	int money = 100_000;
//
//	public int getMoney() {
//		return money;
//	}
//
//	public void setMoney(int money) {
//		this.money = money;
//	}
//
//	// 출금, 입금
//
//	public void saveMoney() {
//		int currentMoney = getMoney();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//		setMoney(currentMoney + money);
//		System.out.println("입금 후 잔액 : " + getMoney());
//	}
//
//	public int widthDraw(int money) {
//		synchronized (this) {
//			int currentMoney = getMoney();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			if (currentMoney >= money) {
//				setMoney(currentMoney - money);
//				System.out.println("출금 후 잔액 : " + getMoney());
//				return money;
//			} else {
//				return 0;
//			}
//		}
//	}
//}
//class Father{
//	BankAccount1 account1;
//	
//	public Father(BankAccount1 account1) {
//		this.account1 = account1;
//	}
//	
//}
//
//
//









