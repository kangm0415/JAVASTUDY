package CHAPTER;

//�������� Ȱ��� ������ Ư�� �ľ�
public class Chapter4 {
	public static void main(String[] arge) {
	/* ����1
 	int num1=10;
	int num2=20;
	int num3=30;
	num1=num2=num3;
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3); */
	/* SCE����	
		int num1 = 0; 
        int num2 = 0;
        boolean result;
        num1 += 10;
        num2 += 10;
        result = (num1 < 0) && (num2 > 0);
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + '\n');
        num1 += 10;
        num2 += 10;
        
        result = (num1 > 0) || (num2 > 0);
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
	*/
		//����3 {25x5)+(36-4)-72}/5�� ����� ��� ���α׷� ����
	//	System.out.println(((25*5)+(36-4)-72)/5);
		//3+6,3+6+9,3+6+9+12�� ���������� �ּҷ� �ۼ�
	/*	int num1=3+6;
		int num2=num1+9;
		int num3=num2+12;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3); */
		//����5  &&�� Ȱ�� 
		int n1=(((25+5)+(36/4)-72)*5);
		int n2=(((25*5)+(36-4)+71)/4);
		int n3=((128/4)*2);
		boolean result1=(n1>n2)&&(n2>n3);
		//n1>n2>n3 �̸� true �ƴϸ� false�� ����ϴ� ���α׷�
		System.out.println(result1);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
	}

}
