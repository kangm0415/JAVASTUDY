package CHAPTER7;

public class BnkAcoountPO {
	static int balance = 0;
	
	public static void main(String[] args) {
			deposit(10000); //�Ա� ���
			checkMyBalance(); //�ܾ� ���
			withdraw(3000); //��� ���
			checkMyBalance(); //�ܾ� ���  -->���� balance�� �����ϰ� �����ϴ� ��ɵ�
		}
	
	public static int deposit(int amount) {
		balance += amount;
		System.out.println("�Ա� : " + amount);
		return balance;
	}
	
	
	public static int withdraw(int amount) {
		balance -= amount;
		System.out.println("��� : " + amount);
		return balance;
	}
	
	public static int checkMyBalance() {
		System.out.println("�ܾ� : " + balance);
		return balance;
	}
	

}
