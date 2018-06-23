package CHAPTER;

public class BitOperator {

	public static void main(String[] args) {
		//��Ʈ�� 1�� true��� �����ϸ� ��
		byte n1 = 5;	  // 00000101
        byte n2 = 3;	  // 00000011
        byte n3 = -1;	  // 11111111

        byte r1 = (byte)(n1 & n2); //00000001, �Ѵ� 1�� ��� 1��
        byte r2 = (byte)(n1 | n2); //00000111, ���� �ϳ��� 1�ϰ�� 1��
        byte r3 = (byte)(n1 ^ n2); //00000110, ���� �ٸ��� 1��
        byte r4 = (byte)(~n3); //00000000, 1�� 0���� 0�� 1��
		
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);	
	}

}
