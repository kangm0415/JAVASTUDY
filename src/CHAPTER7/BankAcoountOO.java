package CHAPTER7;
public class BankAcoountOO {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		System.out.println("�Ա� : " + amount);
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		System.out.println("��� : " + amount);
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("�ܾ� : " + balance);
		return balance;
	}
}

class BankAccountOO{
	public static void main(String[] args) {
		BankAcoountOO yoon = new BankAcoountOO();
		BankAcoountOO park = new BankAcoountOO();	//�ΰ��� �ν��Ͻ� ����
		
		yoon.deposit(5000);
		park.deposit(3000);
		//�� �ν��Ͻ��� �Ա�
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		//�� �ν��Ͻ����� ���
		
		yoon.checkMyBalance();
		park.checkMyBalance();
		
	}
}
