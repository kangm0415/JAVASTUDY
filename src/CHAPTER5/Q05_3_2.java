package CHAPTER5;

public class Q05_3_2 {

	public static void main(String[] args) {
		/* 아래 코드를 switch 문으로 변경
		 int n=24;
		 if(n>=0 && n<10)
		 	System.out.println("0이상 10미만의 수);
		if(n>=10 && n<20)
			System.out.println("10이상 20미만의 수);
		if(n>=20 && n<30)
			System.out.println("20이상 30미만의 수);
		else
			System.out.println("음수 혹은 30이상의 수);
		 */
		int n = 24;
        switch(n / 10) {
        case 0:	//case다음엔 숫자만 올 수 있나보다 씨발
            System.out.println("0이상 10미만의 수");
            break;
        case 1:
            System.out.println("10이상 20미만의 수");
            break;
        case 2:
            System.out.println("20이상 30미만의 수");
            break;
        default:
            System.out.println("음수 혹은 30 이상의 수");
        }
    }
}
