package CHAPTER5;

public class InfinityLoop {

	public static void main(String[] args) {
		int num = 1;
		
		while(true) {//무한루프
			if(((num%6)==0)&&((num%7)==0))//6의 배수이면서 7의 배수를 찾을 때까지 계속하겠다.
				break;
			num++;
		}
		System.out.println(num);
	}

}
