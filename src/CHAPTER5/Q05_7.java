package CHAPTER5;

public class Q05_7 {

	public static void main(String[] args) {
		/* ������ ¦���ܸ� ������, �ٵ����� 2���� 2������ 4�� 4����������ڷ�
		for(int num=2; num<9;num+=2) {
			for(int i=1;i<=num;i++) {
				System.out.println(num+"X"+i+"="+(num*i));
			}
		}	*/
		//AB+BA=99�Ǵ� A,B���� ���ϴ� ���α׷� ������
		for(int i=0; i<11; i++) {
			for(int j=0; j<11; j++) {
				if((i+j)==9) 
					System.out.println("["+i+"."+j+"]");
				
			}
		}
		
	}

}
