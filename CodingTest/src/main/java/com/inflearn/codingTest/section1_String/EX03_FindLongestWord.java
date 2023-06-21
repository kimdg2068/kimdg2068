package com.inflearn.codingTest.section1_String;

import java.util.Scanner;

public class EX03_FindLongestWord {
	/*
	    ����
		�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
		������� �� �ܾ�� �������� ���е˴ϴ�.
		
		�Է�
		ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
		
		���
		ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ��
		�ܾ ������ �մϴ�.
		
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
