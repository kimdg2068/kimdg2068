package com.inflearn.codingTest.section1_String;

import java.util.Scanner;

public class EX02_UptoLowLowToUp {

	/*
		 ����
		�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		�Է�
		ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
		���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
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
