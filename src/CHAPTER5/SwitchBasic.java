package CHAPTER5;

public class SwitchBasic {

	public static void main(String[] args) {
		int n =3;
		//switch는 라벨을 만드는 것 base->라벨라벨
		//구성요소 : switch,case,default
		switch(n) {
		case 1: //만약 n=1이라면 이 아래로 쭉 실행
			System.out.println("예아");
		case 2:
			System.out.println("호우!");
		case 3:
			System.out.println("hi!");
		default:	//해당하는 case없으면 여기서부터 실행
			System.out.println("kakakakak!");
		}
		System.out.println("무조건 나올거야");
	}

}
