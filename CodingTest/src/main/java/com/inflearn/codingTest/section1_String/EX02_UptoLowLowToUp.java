package com.inflearn.codingTest.section1_String;

import java.util.Scanner;

public class EX02_UptoLowLowToUp {

	/*
		 설명
		대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
		
		입력
		첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
		문자열은 영어 알파벳으로만 구성되어 있습니다.
	 */
	public String solution(String str) {
		//StringBuilder sb = new StringBuilder();
		String answer = "";
		for(char c : str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				c = Character.toLowerCase(c); 
			} else {
				c = Character.toUpperCase(c);
			}
			//sb.append(c);
			answer += c;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		EX02_UptoLowLowToUp m = new EX02_UptoLowLowToUp();
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		
		System.out.println(m.solution(inputStr));
	}
}
