package com.inflearn.codingTest.section1_String;

import java.util.Scanner;

public class EX05_SpecificCharsConversion {
/*
 *  설명
	영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
	
	입력
	첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
	
	출력
	첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */
	public String solution(String str) {
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int lt = 0;
		int rt = chars.length-1;
		while(lt < rt) {
			char tmp = chars[lt];
			if(!Character.isAlphabetic(tmp)) lt++;
			else if(!Character.isAlphabetic(chars[rt])) rt--;
			else {
				chars[lt] = chars[rt];
				chars[rt] = tmp;
				lt++;
				rt--;
			}
		}
		sb.append(chars);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		EX05_SpecificCharsConversion scc = new EX05_SpecificCharsConversion();
		
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		System.out.println((scc.solution(inputStr)));
	}
}
