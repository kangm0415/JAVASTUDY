package CHAPTER7;

public class BnkAcoountPO {
	static int balance = 0;
	
	public static void main(String[] args) {
			deposit(10000); //입금 기능
			checkMyBalance(); //잔액 기능
			withdraw(3000); //출근 기능
			checkMyBalance(); //잔액 기능  -->변수 balance를 참조하고 통제하는 기능들
		}
	
	public static int deposit(int amount) {
		balance += amount;
		System.out.println("입금 : " + amount);
		return balance;
	}
	
	
	public static int withdraw(int amount) {
		balance -= amount;
		System.out.println("출금 : " + amount);
		return balance;
	}
	
	public static int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	

}
