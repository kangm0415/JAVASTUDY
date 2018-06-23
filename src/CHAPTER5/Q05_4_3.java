package CHAPTER5;

public class Q05_4_3 {

	public static void main(String[] args) {
		int num = 1;
		int i = 0;
		while(num<1001) {
			if((num%2==0)&&(num%7==0)) {
				System.out.println(num);
				i+=num;}
			++num;
		}
		
		System.out.println("гу : " + i);
		
	}

} 
