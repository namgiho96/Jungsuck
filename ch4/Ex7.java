package ch4;
import java.util.*;
public class Ex7 {
	public static void main(String[] args) {
		System.out.println("����(1),����(2),��(3) �� �ϳ��� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3)+1;
		
		System.out.printf("����� %d �Դϴ�",user);
		System.out.printf("���� %d �Դϴ�.",com);
		
		switch(user-com){
		case 2:	case -1:
			System.out.println("����� �����ϴ�");
			break;
		case 1:	case -2:
			System.out.println("����� �����ϴ�");
			break;
		case 0:	
			System.out.println("�����ϴ� ");
			break;
		}
	}
}
