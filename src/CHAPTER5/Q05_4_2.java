package CHAPTER5;

public class Q05_4_2 {

	public static void main(String[] args) {
		// 1부터 100까지 출력하고 이어서 거꾸로 100에서 1까지 출력하는 프로그램 작성, do~while문 한 번씩사용
		//while문 사용
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
		//do~while문 사용
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
