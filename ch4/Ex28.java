package ch4;
import java.util.*;
public class Ex28 {
	public static void main(String[] args) {
		int input = 0 , answr =0;
		
		answr = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.println("1�� 100������ ������ �Է��ϼ���");
			input = scanner.nextInt();
			
			if(input>answr){
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����");
			}else{
				System.out.println("�� ū���� �ٽ� �õ��غ�����");
			}
		}while(input!=answr);
		System.out.println("�����Դϴ�");
	}
}
