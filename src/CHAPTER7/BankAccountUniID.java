package CHAPTER7;

class BankAccount{
	String accNumber;
	String ssNumber;
	int balance;
	//생성자!!!  이름은 클래스와 똑같이!
	public BankAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		int balance = bal;
		
	}
}

public class BankAccountUniID {
	public static void main(String[] args) {
		//생성자를 호출하는 법
		BankAccount yoon = new BankAccount("12-34-89","970415-1178218",4000000);
	}

}
