package com.inflearn.codingTest.section1_String;

import java.util.Scanner;

public class EX05_SpecificCharsConversion {
/*
 *  ����
	���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
	Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	�Է�
	ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.
	
	���
	ù �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.
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
