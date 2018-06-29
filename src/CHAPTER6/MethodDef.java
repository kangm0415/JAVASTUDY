package CHAPTER6;

public class MethodDef {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hi(18);
		hi(25);
		System.out.println("프로그램 끝");
		
	}
	public static void hi(int num) {
		System.out.println("안녕");
		System.out.println("난"+num+ "살입니다.");

	}
}
