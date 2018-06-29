package CHAPTER6;

public class Method2Param{

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hi(18, 165.5);
		hi(25, 179.24);
		bye();
		
	}
	public static void hi(int num, double num2) {
		System.out.println("안녕");
		System.out.println("난"+num+ "살입니다.");
		System.out.println("난"+num2+ "cm입니다.");

	}
	public static void bye() {
		System.out.println("다음에 뵙겠습니당");
		
	}
}
