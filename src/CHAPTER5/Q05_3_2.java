package CHAPTER5;

public class Q05_3_2 {

	public static void main(String[] args) {
		/* �Ʒ� �ڵ带 switch ������ ����
		 int n=24;
		 if(n>=0 && n<10)
		 	System.out.println("0�̻� 10�̸��� ��);
		if(n>=10 && n<20)
			System.out.println("10�̻� 20�̸��� ��);
		if(n>=20 && n<30)
			System.out.println("20�̻� 30�̸��� ��);
		else
			System.out.println("���� Ȥ�� 30�̻��� ��);
		 */
		int n = 24;
        switch(n / 10) {
        case 0:	//case������ ���ڸ� �� �� �ֳ����� ����
            System.out.println("0�̻� 10�̸��� ��");
            break;
        case 1:
            System.out.println("10�̻� 20�̸��� ��");
            break;
        case 2:
            System.out.println("20�̻� 30�̸��� ��");
            break;
        default:
            System.out.println("���� Ȥ�� 30 �̻��� ��");
        }
    }
}
