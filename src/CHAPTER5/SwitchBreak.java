package CHAPTER5;

public class SwitchBreak {

	public static void main(String[] args) {
		int n = 2;	
		switch(n) {
			case 1: 
				System.out.println("예아");
				break; //탈출
			case 2:
				System.out.println("호우!");
				break;
			case 3:
				System.out.println("hi!");
				break;
			default:	
				System.out.println("kakakakak!");
				break;
			}
			System.out.println("무조건 나올거야");
		}

	}