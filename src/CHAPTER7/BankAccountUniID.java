package CHAPTER7;

class BankAccount{
	String accNumber;
	String ssNumber;
	int balance;
	//������!!!  �̸��� Ŭ������ �Ȱ���!
	public BankAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		int balance = bal;
		
	}
}

public class BankAccountUniID {
	public static void main(String[] args) {
		//�����ڸ� ȣ���ϴ� ��
		BankAccount yoon = new BankAccount("12-34-89","970415-1178218",4000000);
	}

}
