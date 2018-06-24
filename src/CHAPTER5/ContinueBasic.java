package CHAPTER5;

public class ContinueBasic {

	public static void main(String[] args) {
		int num = 0;
		int count=0;
		
		while((num++)<100) {
			if(((num%5)!=0)||((num%7)!=0)) //5의 배수가 아니거나 7의 배수가 아니면
				continue;  //다시 반복문 꼭대기로 (아래생략하고)
			count++; //만약 5의 배수, 7의 배수라면 요 아래로 실행
			System.out.println(num);
		}
		System.out.println("count : " + count);		
	}

}
