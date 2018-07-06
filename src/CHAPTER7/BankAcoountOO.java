package CHAPTER7;
public class BankAcoountOO {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		System.out.println("입금 : " + amount);
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		System.out.println("출금 : " + amount);
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}

class BankAccountOO{
	public static void main(String[] args) {
		BankAcoountOO yoon = new BankAcoountOO();
		BankAcoountOO park = new BankAcoountOO();	//두개의 인스턴스 생성
		
		yoon.deposit(5000);
		park.deposit(3000);
		//각 인스턴스에 입금
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		//각 인스턴스에서 출금
		
		yoon.checkMyBalance();
		park.checkMyBalance();
		
	}
}
