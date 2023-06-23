package com.inflearn.section1;

import java.util.Scanner;

public class EX04_WordsConversion {
	/*
		설명
		N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
		
		입력
		첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
		두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
	*/
	public String solution(String str) {
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int lt = 0;
		int rt = chars.length-1;
		while(lt < rt) {
			char tmp = chars[lt];
			chars[lt] = chars[rt];
			chars[rt] = tmp;
			lt++;
			rt--;
		}
		sb.append(chars);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		EX04_WordsConversion m = new EX04_WordsConversion();
		
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		String inputStr;
		for(int i=0; i<count; i++) {
			inputStr = sc.nextLine();
			System.out.println(m.solution(inputStr));
		}
	}
}
