package ch4;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args) {
		int menu =0;
		int num =0;
		
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0){
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else if (!(1 <= menu && menu <= 3)){
				System.out.println("�޴��� �߸������ϼ˽��ϴ�.(����� 0)");
				continue;
			}
			System.out.println("�����Ͻ� �޴��� "+ menu+"���Դϴ�2");
		}
	}
}
