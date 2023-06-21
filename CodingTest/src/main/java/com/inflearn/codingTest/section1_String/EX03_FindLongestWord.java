package com.inflearn.codingTest.section1_String;

import java.util.Scanner;

public class EX03_FindLongestWord {
	/*
	    설명
		한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
		문장속의 각 단어는 공백으로 구분됩니다.
		
		입력
		첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
		
		출력
		첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
		단어를 답으로 합니다.
		
		i am hello study keeping unscripted unscccpted unsccppted
	 */
	public String solution(String str) {
		String[] words = str.split(" ");
		String answer = words[0];
		
		for(int i=0; i<words.length-1; i++) {
			int j = i + 1;
			if(answer.length() < words[j].length()) answer = words[j];
		}				
		return answer;
	}
	
	public String solutionT(String str) {
		String answer = "";
		int MIN_VALUE = Integer.MIN_VALUE;
		
		int idx;
		while((idx = str.indexOf(" ")) != -1) {
			String subStr = str.substring(0, idx);
			int subStrLen = subStr.length();
			if(subStrLen > MIN_VALUE) {
				MIN_VALUE = subStrLen;
				answer = subStr;
			}
			str = str.substring(idx+1);
		}
		if(str.length() > MIN_VALUE) answer = str;
		
		return answer;
	}
	
	public static void main(String[] args) {
		EX03_FindLongestWord m = new EX03_FindLongestWord();
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
		//System.out.println(m.solution(inputStr));
		System.out.println(m.solutionT(inputStr));
	}
}
