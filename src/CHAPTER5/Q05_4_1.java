package CHAPTER5;

public class Q05_4_1 {

	public static void main(String[] args) {
		// 1부터 99까지의 합을 구하는 프로그램을 while문을 이용해 작성
		int num=0;
		int i=1;
		while(i<100) {
			num+=i;
			i++;
		}
		System.out.println(num);
	}

}
