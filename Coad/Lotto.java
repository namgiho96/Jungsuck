package Coad;
import java.util.*;
public class Lotto {
	public static void main(String[] args) {

		int[] lotte = new int[6];
			int[] my = new int[6];
			int count =0;
			Scanner scanner = new Scanner(System.in);
			int i,j;
			
			for(i=0;i<lotte.length;i++) {
				lotte[i] = (int) ((Math.random()*45)+1); //6�� ��������
				if(i>0) {
					for(j=0;j<i;j++){
						while(lotte[i]==lotte[j]) {
							lotte[i] = (int)((Math.random()*45)+1);//�ѹ��� 6���� ���ڸ� �������ش�.
						}
					}
				}
			}
			for(i=0;i<my.length;i++) {
				System.out.println("����"+(i+1)+":");//���� ���� ���ڸ� ����Ѵ�. ù��°�� ����Ѵ�
				my[i] = scanner.nextInt();//���� ���ڸ� �Է��� �޴´�
			}
			System.out.println();
			System.out.println("���� ��������:");
			for(i=0;i<my.length;i++) {
				System.out.print(my[i]+" ");//���� ���� ���ڸ� ����Ѵ�
			}
			System.out.println();
			System.out.println("���� ��������:");
			for(i=0;i<lotte.length;i++) {
				System.out.print(lotte[i]+" ");
			}
			System.out.println();
			
			
			for(i=0;i<my.length;i++) {
				for(j=0; j<lotte.length;j++) {
					if(my[i]==lotte[j]) {
						count +=1;
						
					}
					}
				
			}
				System.out.println("���� ����:"+count);
				
				switch(count) {
				case 6: System.out.println("1�� ��÷�Դϴ�");break;
				case 5: System.out.println("2�� ��÷�Դϴ�");break;
				case 4: System.out.println("3�� ��÷�Դϴ�");break;
				case 3: System.out.println("4�� ��÷�дϴ�");break;
				
				}
			
			
			
	}
}
