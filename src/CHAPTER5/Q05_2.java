package CHAPTER5;

public class Q05_2 {

	public static void main(String[] args) {
		/* �Ʒ� �������� ���� �����ڸ� ������� �ʰ� ��ſ� if~else ������ ����ϴ� ���·� �����غ���
		int num1 =50;
		int num2 =100;
		int big;
		int diff;
		
		big =(num1>num2) ? num1:num2;
		System.out.println("ū �� : " + big);
		
		diff = (num1>num2) ? (num1-num2) : (num2-num1);
		System.out.println("���� : " + diff);
		 */
		int num1 =100;
		int num2 =70;
		int big;
		int diff;
		if (num1>num2)
			System.out.println("ū�� : "+ num1);
		else 
			System.out.println("ū�� : "+ num2);
		
		if(num1>num2)
			System.out.println("���� : "+ (num1-num2));
		else 
			System.out.println("���� : "+ (num2-num1));
		
		/* ������ ��
	    int num1 = 50;
        int num2 = 100;
        int big;
        int diff;

        if(num1 > num2)
            big = num1;
        else
            big = num2;
        
        System.out.println(big);
		
	if(num1 > num2)
            diff = num1 - num2;
        else
            diff = num2 - num1;
        
        System.out.println(diff);	
		 */
			

	}

}
