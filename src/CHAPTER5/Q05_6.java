package CHAPTER5;

public class Q05_6 {

	public static void main(String[] args) {
	/*	�Ʒ� �ڵ忡�� while���� for������ �ٲ����
	 * int num = 0;
		int count=0;
		
		while((num++)<100) {
			if(((num%5)!=0)||((num%7)!=0)) 
				continue;  
			count++; 
			System.out.println(num);
		}
		System.out.println("count : " + count);		*/
		//��
/*		int count = 0;
		for(int num=1; num<101; num++){
			if(((num % 5)==0)&&((num%7)==0)) {
				count++;
			System.out.println(num);}
				}
		System.out.println("count : " + count); */
		int num=1;
		int count =0;
		int sum =0;
		for( ; ; ) {
			if((num%2)==1) {
				sum+=num;
				
			}
			if(sum>1000) {
				break;
			}
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
		
		
	
		
		
		
		
			}
	}
