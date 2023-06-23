package com.inflearn.section1;

import java.util.Scanner;

public class EX08_ValidPalindromeString {
	/*
	   ����
		�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
		���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
		�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
		���ĺ� �̿��� ���ڵ��� �����մϴ�.
		
		�Է�
		ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
		
		���
		ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.
	 */
	
	public String mySol(String str) {
		//�� ���̵��: lt, rt �̿�: lt�� ���ĺ�X lt++, rt�� ���ĺ�X rt--, lt�� rt ��� ���ĺ�O toUpperCase�� ������ ��.
		String ans = "YES";
		String strToUp = str.toUpperCase();
		int lt = 0;
		int rt = str.length() - 1;
		while(lt < rt) {
			char ltChar = strToUp.charAt(lt);
			char rtChar = strToUp.charAt(rt);
			if(!Character.isAlphabetic(ltChar)) lt++;
			else if(!Character.isAlphabetic(rtChar)) rt--;
			else {
				if(ltChar == rtChar) {
					lt++;
					rt--;
				} else {
					ans = "NO";
					break;
				}
			}
		}
		
		return ans;
	}
	
	public String solution(String str) {
		// ���� ���̵��: ���Խ��� ����ؼ� ���ĺ��� �ƴ� ���ڴ� ���ڿ����� �����ع���. ���δ�.
		// replace�� ���Խ� ��� �Ұ��ϹǷ� replaceAll ����ؾ� ��.
		String ans = "YES";
		String repStr = str.toUpperCase().replaceAll("[^A-Z]", "");
		String revStr = new StringBuilder(repStr).reverse().toString();
		if(!repStr.equals(revStr)) ans = "NO";
		
		return ans;
	}
	
	public static void main(String[] args) {
		EX08_ValidPalindromeString vps = new EX08_ValidPalindromeString();
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		System.out.println(vps.solution(inputStr));
	}
}
