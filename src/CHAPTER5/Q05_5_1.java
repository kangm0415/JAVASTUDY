package CHAPTER5;

public class Q05_5_1 {

	public static void main(String[] args) {
		/* 1부터 10까지의 곱의 결과를 출력하는 걸 for문을 사용하여 ㄱㄱ
		int num=1;
		for(int i = 1; i<11; i++) {
			num*=i;
		}
		System.out.println(num); */
		
		//구구단 중 5단을 출력하는 프로그램을 for문을 사용해 작성
		int num = 5;
		for(int i = 1; i<10;i++) {
			System.out.println(num +"*"+ i +"=" + num*i );
		}
	}

}
