package CHAPTER;

public class BitShiftOp {

	public static void main(String[] args) {
		byte num;
		//"<<"는 곱하기 2배
		//">>"는 나누기 2로
        num = 2;     // 00000010
        System.out.print((byte)(num << 1) + "  ");           // 00000100
        System.out.print((byte)(num << 2) + "  ");           // 00001000
        System.out.print((byte)(num << 3) + "  " + '\n');    // 00010000
  
        num = 8;     // 00001000
        System.out.print((byte)(num >> 1) + "  ");           // 00000100
        System.out.print((byte)(num >> 2) + "  ");           // 00000010
        System.out.print((byte)(num >> 3) + "  " + '\n');    // 00000001

        num = -8;    // 11111000
        System.out.print((byte)(num >> 1) + "  ");           // 11111100
        System.out.print((byte)(num >> 2) + "  ");           // 11111110
        System.out.print((byte)(num >> 3) + "  " + '\n');    // 11111111
        
        /* 출력값
          4  8  16  
          4  2  1  
         -4  -2  -1  */  

	}

}
