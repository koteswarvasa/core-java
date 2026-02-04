///* "2356789" k=3 ----> 5555789

package com.tasks.strings;

import java.util.Arrays;

public class ConvertTOLargeValues {

	public static String solution(String S, int K) {
		char[] ch = S.toCharArray();
		int[] arr = {1,2,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(ch);

		for (char i = 0; i < ch.length; i++) {
			int a = ch[i] - '0';
			System.out.println(a);
			if (K > 0) {
				if (a < 5) {
					ch[i] = '5';
					K--;
				}
			}
		}

		return new String(ch);
	}

	public static void main(String[] args) {
		String s = "165232";

		int k = 3;
		System.out.println(solution(s, k));
	}
}
