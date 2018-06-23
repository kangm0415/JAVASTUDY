package CHAPTER5;

public class Q05_2 {

	public static void main(String[] args) {
		/* 아래 예제에서 조건 연산자를 사용하지 않고 대신에 if~else 문으로 사용하는 형태로 수정해보장
		int num1 =50;
		int num2 =100;
		int big;
		int diff;
		
		big =(num1>num2) ? num1:num2;
		System.out.println("큰 수 : " + big);
		
		diff = (num1>num2) ? (num1-num2) : (num2-num1);
		System.out.println("절댓값 : " + diff);
		 */
		int num1 =100;
		int num2 =70;
		int big;
		int diff;
		if (num1>num2)
			System.out.println("큰수 : "+ num1);
		else 
			System.out.println("큰수 : "+ num2);
		
		if(num1>num2)
			System.out.println("절댓값 : "+ (num1-num2));
		else 
			System.out.println("절댓값 : "+ (num2-num1));
		
		/* 정석의 답
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
