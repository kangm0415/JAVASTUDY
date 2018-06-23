package CHAPTER5;

public class Q05_1 {
/* 아래코드에서 하나의 if만 사용하도록 변경
	public static void main(String[] args) {
		int num =120;
		if(num >0) {
			if((num%2)==0)
				System.out.println("양수이면서 짝수");
		}

	}	*/
	public static void main(String[] args) {
		int num =120;
			if((num >0)&&(num%2)==0)
				System.out.println("양수이면서 짝수");
		

	}
}
