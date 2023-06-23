package com.inflearn.section1;

import java.util.Scanner;

public class EX09_ExtractNums {
	/*
	 ����
	���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
	���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
	�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
	
	�Է�
	ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.

	���
	ù �ٿ� �ڿ����� ����մϴ�.
	 */
	
	public int mySol(String str) {
		//�� ���̵��: ���Խ����� ���ڸ� ������ �� parseInt
		String repStr = str.replaceAll("[^0-9]", "");
		return Integer.parseInt(repStr);
	}
	
	public int solution1(String str) {
		//�ΰ� ���̵��1: �ƽ�Ű �ڵ� �̿��ؼ� ���ڸ� ������ �� ans ������ 10�� ���ϰ� ���� ���ؼ� �� �����.
		int ans = 0;
		for(int i=0; i<str.length(); i++) {
			char cha = str.charAt(i);
			if(cha >= 48 && cha <= 57) ans = ans * 10 + (cha - 48);
		}
		return ans;
	}
	
	public int solution2(String str) {
		//�ΰ� ���̵��2: isDigit���� ���ڸ� ������ �� parseInt
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
