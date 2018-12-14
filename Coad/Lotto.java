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
				lotte[i] = (int) ((Math.random()*45)+1); //6번 점수생성
				if(i>0) {
					for(j=0;j<i;j++){
						while(lotte[i]==lotte[j]) {
							lotte[i] = (int)((Math.random()*45)+1);//한번더 6개의 숫자를 생성해준다.
						}
					}
				}
			}
			for(i=0;i<my.length;i++) {
				System.out.println("숫자"+(i+1)+":");//내가 쳐준 숫자를 출력한다. 첫번째를 출력한다
				my[i] = scanner.nextInt();//나의 숫자를 입력을 받는다
			}
			System.out.println();
			System.out.println("내가 뽑은숫자:");
			for(i=0;i<my.length;i++) {
				System.out.print(my[i]+" ");//내가 쳐준 숫자를 출력한다
			}
			System.out.println();
			System.out.println("컴이 뽑은숫자:");
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
				System.out.println("맞은 개수:"+count);
				
				switch(count) {
				case 6: System.out.println("1등 당첨입니다");break;
				case 5: System.out.println("2등 당첨입니다");break;
				case 4: System.out.println("3등 당첨입니다");break;
				case 3: System.out.println("4등 당첨압니다");break;
				
				}
			
			
			
	}
}
