package array;
import java.util.*;

import javax.sound.midi.Synthesizer;
public class MyClass {

	public static void main(String[] args) {
		String[] res ={"","","",""};
		String[]  class1 =  new String[20];
		String[]  vivace = {"박은지","지우","허현","이창준",""};
		String[] javaching = {"창아","정욱","수호","은영",""};
		String[]  atlas = {"동준","김이레","이지은","종협",""};
		String[] nm = {"정우","승아","기호","태혁",""};
		System.out.println("팀장만 : ");
		//입력장치는 필요할때 써라!
		String[][] tema = {vivace,javaching,atlas,nm};
		int idx = 0;
		//배열이면 무조건 for 문을 걸어라!!!
		for(int i =0;i<tema.length;i++){
			for(int j = 0;j<1;j++) {
				res[i] = tema [i][j];
			}
		}
		for(int i=0; i<res.length;i++){
			System.out.println(res[i]);
			
		}
		
}
		
		
			
		}
		
		
		
	
		
	
	


