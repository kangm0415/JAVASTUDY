package CHAPTER5;

public class Q05_3_1 {

	public static void main(String[] args) {
		/* 아래 이걸, switch문이 아닌 if~else문을 이용하는 형태로 변경해보자.
		 * int n = 2;	
		switch(n) {
			case 1: 
				System.out.println("예아");
				break; //탈출
			case 2:
				System.out.println("호우!");
				break;
			case 3:
				System.out.println("hi!");
				break;
			default:	
				System.out.println("kakakakak!");
				break;
			}
			System.out.println("무조건 나올거야");
		 */
		int n =2;	
		if(n==1)   
				System.out.println("예아");
							
		else if (n==2)
				System.out.println("호우!");
				
		else if (n==3)
				System.out.println("hi!");
				
		else
				System.out.println("kakakakak!");
	
			System.out.println("무조건 나올거야");
	}
}
