package CHAPTER6;

public class Methodreturn {

	public static void main(String[] args) {
		int result;
		result = adder(4, 5); //adder�� ��ȯ�ϴ� ���� result�� ����
							  // adder(4,5)->addResult ������ �ٲ�
		System.out.println("4+5="+result);
		System.out.println("3.5X3.5="+square(3.5));

	}
	public static int adder(int num1, int num2) {
		int addResult = num1+num2;
		return addResult; //addResult�� ���� ��ȯ
	}
	public static double square(double num) {
		return num*num; //num*num�� ����� ��ȯ
	}
}
