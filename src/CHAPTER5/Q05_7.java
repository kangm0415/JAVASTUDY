package CHAPTER5;

public class Q05_7 {

	public static void main(String[] args) {
		/* 구구단 짝수단만 나오게, 근데씨발 2단은 2까지만 4는 4까지만요로코롬
		for(int num=2; num<9;num+=2) {
			for(int i=1;i<=num;i++) {
				System.out.println(num+"X"+i+"="+(num*i));
			}
		}	*/
		//AB+BA=99되는 A,B조합 구하는 프로그램 구하자
		for(int i=0; i<11; i++) {
			for(int j=0; j<11; j++) {
				if((i+j)==9) 
					System.out.println("["+i+"."+j+"]");
				
			}
		}
		
	}

}
