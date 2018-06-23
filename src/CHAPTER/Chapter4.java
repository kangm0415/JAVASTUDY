package CHAPTER;

//연산자의 활용과 연산의 특성 파악
public class Chapter4 {
	public static void main(String[] arge) {
	/* 문제1
 	int num1=10;
	int num2=20;
	int num3=30;
	num1=num2=num3;
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3); */
	/* SCE설명	
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
		//문제3 {25x5)+(36-4)-72}/5의 계산결과 출력 프로그램 ㄱㄱ
	//	System.out.println(((25*5)+(36-4)-72)/5);
		//3+6,3+6+9,3+6+9+12의 덧셈연산자 최소로 작성
	/*	int num1=3+6;
		int num2=num1+9;
		int num3=num2+12;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3); */
		//문제5  &&의 활용 
		int n1=(((25+5)+(36/4)-72)*5);
		int n2=(((25*5)+(36-4)+71)/4);
		int n3=((128/4)*2);
		boolean result1=(n1>n2)&&(n2>n3);
		//n1>n2>n3 이면 true 아니면 false를 출력하는 프로그램
		System.out.println(result1);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
	}

}
