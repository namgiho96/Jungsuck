package array;
import java.util.*;

import javax.sound.midi.Synthesizer;
public class MyClass {

	public static void main(String[] args) {
		String[] res ={"","","",""};
		String[]  class1 =  new String[20];
		String[]  vivace = {"������","����","����","��â��",""};
		String[] javaching = {"â��","����","��ȣ","����",""};
		String[]  atlas = {"����","���̷�","������","����",""};
		String[] nm = {"����","�¾�","��ȣ","����",""};
		System.out.println("���常 : ");
		//�Է���ġ�� �ʿ��Ҷ� ���!
		String[][] tema = {vivace,javaching,atlas,nm};
		int idx = 0;
		//�迭�̸� ������ for ���� �ɾ��!!!
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
		
		
		
	
		
	
	


