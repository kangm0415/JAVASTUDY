package CHAPTER5;

public class SwitchBasic {

	public static void main(String[] args) {
		int n =3;
		//switch�� ���� ����� �� base->�󺧶�
		//������� : switch,case,default
		switch(n) {
		case 1: //���� n=1�̶�� �� �Ʒ��� �� ����
			System.out.println("����");
		case 2:
			System.out.println("ȣ��!");
		case 3:
			System.out.println("hi!");
		default:	//�ش��ϴ� case������ ���⼭���� ����
			System.out.println("kakakakak!");
		}
		System.out.println("������ ���ðž�");
	}

}
