package CHAPTER5;

public class BreakPoint {

	public static void main(String[] args) {
	outer:	for(int i=2; i<10; i++ ) {
			for(int j=1; j<10;j++) {
				if((i*j)==72) {
					System.out.println(i+"X"+j+"="+(i*j));
				//	break; //요로코롬하면 8X9랑 9X8이 다나온다. 요건 바로위 for만 빠져나감
					break outer;//위에 outer설정한 반복문을 빠져나간다
				}
			}
		}

	}

}
