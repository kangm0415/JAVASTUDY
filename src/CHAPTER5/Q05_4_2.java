package CHAPTER5;

public class Q05_4_2 {

	public static void main(String[] args) {
		// 1���� 100���� ����ϰ� �̾ �Ųٷ� 100���� 1���� ����ϴ� ���α׷� �ۼ�, do~while�� �� �������
		//while�� ���
	/*	int num=1;
		while(num<101) {
			System.out.println(num);
			++num;
		}
			--num;
		while(num>0) {
			System.out.println(num);
			--num;
		}	*/
		//do~while�� ���
		int num=1;
		do {
			System.out.println(num);
			++num;
		}while(num<101);
		--num;
		do {
			System.out.println(num);
			--num;
		}while(num>0);
	}

}
