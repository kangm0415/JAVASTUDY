package CHAPTER5;

public class InfinityLoop {

	public static void main(String[] args) {
		int num = 1;
		
		while(true) {//���ѷ���
			if(((num%6)==0)&&((num%7)==0))//6�� ����̸鼭 7�� ����� ã�� ������ ����ϰڴ�.
				break;
			num++;
		}
		System.out.println(num);
	}

}
