package ch4;
import java.util.*;
public class Ex10 {
	public static void main(String[] args) {
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ���(011231-1111222)>");
		
		Scanner scanner =  new Scanner(System.in);
		String regno = scanner.nextLine();
		char  gender =  regno.charAt(7);
		
		switch(gender){
		case '1': case '3':
			switch(gender){
			case '1':
				System.out.println("����� 2000�� ������ ����� �����Դϴ�");
				break;
			case '3':
				System.out.println("����� 2000�� ���ķ� ����� �����Դϴ�");
				
			}
			break;
		case '2': case '4':
			switch(gender){
		case '2':
			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
			break;
		case '4':
			System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�");
		}
		break;
		default:
			System.out.println("��ȿ���� �ʴ� �ֹε�Ϲ�ȣ�Դϴ�");
	}

}
}