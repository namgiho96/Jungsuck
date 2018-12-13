package ch4;
import java.util.*;
public class Ex28 {
	public static void main(String[] args) {
		int input = 0 , answr =0;
		
		answr = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.println("1과 100사이의 정수를 입력하세요");
			input = scanner.nextInt();
			
			if(input>answr){
				System.out.println("더 작은 수로 다시 시도해보세요");
			}else{
				System.out.println("더 큰수로 다시 시도해보세요");
			}
		}while(input!=answr);
		System.out.println("정답입니다");
	}
}
