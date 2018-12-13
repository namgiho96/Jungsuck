package ch4;
import java.util.*;
public class Ex5 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수를 입력해주세요>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다 %n",score);
	}
}
