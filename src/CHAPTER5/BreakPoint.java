package CHAPTER5;

public class BreakPoint {

	public static void main(String[] args) {
	outer:	for(int i=2; i<10; i++ ) {
			for(int j=1; j<10;j++) {
				if((i*j)==72) {
					System.out.println(i+"X"+j+"="+(i*j));
				//	break; //����ڷ��ϸ� 8X9�� 9X8�� �ٳ��´�. ��� �ٷ��� for�� ��������
					break outer;//���� outer������ �ݺ����� ����������
				}
			}
		}

	}

}
