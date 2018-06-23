package CHAPTER5;

public class IEIE {

	public static void main(String[] args) {
		int num = 50;
		if(num<0) //먼저검사
			System.out.println("0미만");
		
		else if(num<100) //위 조건이 만족하지 않으면 또 검사
			System.out.println("0이상 100미만");
		
		else //아무것도 만족하지 않으면 else에 속한 문장실행
			System.out.println("100이상");
			
		
	}

}
