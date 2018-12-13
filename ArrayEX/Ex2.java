package ArrayEX;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100,95,80,70,60};
		char[] chArr ={'a','b','c','d'};
		
		for(int i=0; i<iArr1.length;i++){
			iArr1[i] = i + 1;
		}
		for(int i=0; i<iArr1.length;i++){
			iArr2[i] = (int)(Math.random()*10);
		}
		for(int i=0; i<iArr1.length;i++){
			System.out.println(iArr1[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}
}
