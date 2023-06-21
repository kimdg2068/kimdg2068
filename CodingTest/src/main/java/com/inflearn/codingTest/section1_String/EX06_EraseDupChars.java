package com.inflearn.codingTest.section1_String;

import java.util.Scanner;

public class EX06_EraseDupChars {
	/*
	    설명
		소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
		중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
		
		입력
		첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
		
		출력
		첫 줄에 중복문자가 제거된 문자열을 출력합니다.
	 */
	
	public String mySolution(String str) {
		//내 아이디어: 첫문자부터 순차비교해서 같은 문자가 있다면 0으로 초기화하여 출력 문자열에서 거르자!
		//단점: 이중 for문 필요. 시간복잡도 상승.
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<chars.length; i++) {
			char cha = chars[i];
			if(cha != 0) {
				for(int j=i+1; j<chars.length; j++) {
					if(cha == chars[j]) {
						chars[j] = 0;
					}
				}
				sb.append(cha);
			}
		}
		
		return sb.toString();
	}
	
	public String solution(String str) {
		//인강 아이디어: indexOf 함수를 사용하면 중복문자의 가장 첫 인덱스를 알 수 있으니 현재 위치와 인덱스가 다른 놈은 거르자!
		//내 아이디어보다 시간복잡도도 낮고 깔끔하다!
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char cha = str.charAt(i);
			if(i == str.indexOf(cha)) sb.append(cha);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		EX06_EraseDupChars dce = new EX06_EraseDupChars();
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		System.out.println(dce.solution(inputStr));
	}
}
