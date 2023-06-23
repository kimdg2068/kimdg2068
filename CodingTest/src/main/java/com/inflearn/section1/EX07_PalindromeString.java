package com.inflearn.section1;

import java.util.Scanner;

public class EX07_PalindromeString {
	/*
	    ����
		�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
		���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
		�� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.
		
		�Է�
		ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
		
		���
		ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.
	 */
	
	public String mySolution(String str) {
		//�� ���̵��: string �빮�ڷ� �ٲ������ lt, rt ���ؼ� �ٸ��� break&NO, �������� answer ���.
		String answer = "YES";
		String strToUp = str.toUpperCase();
		int lt = 0;
		int rt = strToUp.length()-1;
		while(lt < rt) {
			if(strToUp.charAt(lt) != strToUp.charAt(rt)) {
				answer = "NO";
				break;
			}
			lt++;
			rt--;
		}
		return answer;
	}
	
	public String solution1(String str) {
		//���� ���̵��1: ���ڿ� ���� ���ݸ� for�� ������ �ε��� i vs str.length()-1-i ��
		//for�� ���ݸ� ������ �ǰ� ���� ���� ������ �ʿ� ��� ����.
		//���� �������� �̷��� Ǯ���� �� ������.. ������ ���� ���� ��԰� �;����� �ٸ� ����� �� �� ��������..
		String answer = "YES";
		String inputStr = str.toUpperCase();
		int len = inputStr.length();
		for(int i=0; i<len/2; i++) {
			if(inputStr.charAt(i) != inputStr.charAt(len-1-i)) {
				answer = "NO";
				break;
			}
		}
		return answer;
	}
	
	public String solution2(String str) {
		//���� ���̵��2: ������ ������� �ϴϱ� StringBuilder reverse�� equalsIgnoreCase ����ؼ� ������.
		//�³� equalsIgnoreCase ������ �������. ���� ���ʰ� �߿��ϴ�. �̷� ������ ���� Ǫ�µ� ȿ���� �ٸ���..
		String answer = "YES";
		String revStr = new StringBuilder(str).reverse().toString();
		if(!str.equalsIgnoreCase(revStr)) answer = "NO";
		return answer;
	}

	public static void main(String[] args) {
		EX07_PalindromeString ps = new EX07_PalindromeString();
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		System.out.println(ps.solution2(inputStr));
	}
}
