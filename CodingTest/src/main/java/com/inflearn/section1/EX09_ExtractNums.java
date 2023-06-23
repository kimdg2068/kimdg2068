package com.inflearn.section1;

import java.util.Scanner;

public class EX09_ExtractNums {
	/*
	 설명
	문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
	만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
	추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
	
	입력
	첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.

	출력
	첫 줄에 자연수를 출력합니다.
	 */
	
	public int mySol(String str) {
		//내 아이디어: 정규식으로 숫자만 추출한 뒤 parseInt
		String repStr = str.replaceAll("[^0-9]", "");
		return Integer.parseInt(repStr);
	}
	
	public int solution1(String str) {
		//인강 아이디어1: 아스키 코드 이용해서 숫자만 추출한 뒤 ans 변수에 10씩 곱하고 숫자 더해서 답 만들기.
		int ans = 0;
		for(int i=0; i<str.length(); i++) {
			char cha = str.charAt(i);
			if(cha >= 48 && cha <= 57) ans = ans * 10 + (cha - 48);
		}
		return ans;
	}
	
	public int solution2(String str) {
		//인강 아이디어2: isDigit으로 숫자만 추출한 뒤 parseInt
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char cha = str.charAt(i);
			if(Character.isDigit(cha)) sb.append(cha);
		}
		return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) {
		EX09_ExtractNums en = new EX09_ExtractNums();
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		System.out.println(en.solution2(inputStr));
	}
}
