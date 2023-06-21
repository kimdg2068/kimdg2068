package com.inflearn.codingTest.section1_String;

import java.util.Scanner;

public class EX06_EraseDupChars {
	/*
	    ����
		�ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.
		
		�Է�
		ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
		
		���
		ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.
	 */
	
	public String mySolution(String str) {
		//�� ���̵��: ù���ں��� �������ؼ� ���� ���ڰ� �ִٸ� 0���� �ʱ�ȭ�Ͽ� ��� ���ڿ����� �Ÿ���!
		//����: ���� for�� �ʿ�. �ð����⵵ ���.
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
		//�ΰ� ���̵��: indexOf �Լ��� ����ϸ� �ߺ������� ���� ù �ε����� �� �� ������ ���� ��ġ�� �ε����� �ٸ� ���� �Ÿ���!
		//�� ���̵��� �ð����⵵�� ���� ����ϴ�!
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
