package ch4;
import java.util.*;
public class Ex8 {
	public static void main(String[] args) {
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ���(011231-1111222)");
		
		Scanner scanner = new Scanner(System.in);
		String regno = scanner.nextLine();
		
		char gender = regno.charAt(7);
		
		switch(gender){
		case 1: case 3:
			System.out.println("����� �����Դϴ� ");
			break;
		case 2: case 4:
			System.out.println("����� �����Դϴ�");
			break;
			default:
				System.out.println("��ȿ���� �ʴ� �ֹε�Ϲ�ȣ�Դϴ�");
			
		}
	}
}
