package CHAPTER5;

public class ContinueBasic {

	public static void main(String[] args) {
		int num = 0;
		int count=0;
		
		while((num++)<100) {
			if(((num%5)!=0)||((num%7)!=0)) //5�� ����� �ƴϰų� 7�� ����� �ƴϸ�
				continue;  //�ٽ� �ݺ��� ������ (�Ʒ������ϰ�)
			count++; //���� 5�� ���, 7�� ������ �� �Ʒ��� ����
			System.out.println(num);
		}
		System.out.println("count : " + count);		
	}

}
