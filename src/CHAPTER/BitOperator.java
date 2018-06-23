package CHAPTER;

public class BitOperator {

	public static void main(String[] args) {
		//비트에 1을 true라고 생각하면 됨
		byte n1 = 5;	  // 00000101
        byte n2 = 3;	  // 00000011
        byte n3 = -1;	  // 11111111

        byte r1 = (byte)(n1 & n2); //00000001, 둘다 1일 경우 1로
        byte r2 = (byte)(n1 | n2); //00000111, 둘중 하나라도 1일경우 1로
        byte r3 = (byte)(n1 ^ n2); //00000110, 둘이 다르면 1로
        byte r4 = (byte)(~n3); //00000000, 1을 0으로 0을 1로
		
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);	
	}

}
