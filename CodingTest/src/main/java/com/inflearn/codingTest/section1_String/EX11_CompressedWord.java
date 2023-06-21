package com.inflearn.codingTest.section1_String;

import java.util.Scanner;

public class EX11_CompressedWord {
	/*
	 	����
		���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�
		���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		�� �ݺ�Ƚ���� 1�� ��� �����մϴ�.
		�Է�
		ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
		���
		ù �ٿ� ����� ���ڿ��� ����Ѵ�
	 */
	
	public String mySol(String str) {
		//�� ���̵��: 
		//ù ���� �ʱ�ȭ�Ͽ� str.charAt(i)�� ��, ������ count++ �ٸ��� sb�� ���� ���ڿ� count�� �߰�(count 1�̸� ����), ���� �� ���ڷ� count 1�� �ʱ�ȭ
		//���� ���ڿ� �� ���ڸ� ���Ͽ� ���� ���ڸ� sb�� �߰��ϹǷ� ������ ���� ó���� ���� ����� ��.
		StringBuilder sb = new StringBuilder();
		char preChar = str.charAt(0);
		int count = 1;
		for(int i=1; i<str.length(); i++) {
			char curChar = str.charAt(i);
			if(curChar == preChar) {
				count++;
			} else {
				sb.append(preChar);
				if(count != 1) {
					sb.append(count);
				}
				preChar = curChar;
				count = 1;
			}
			if(i == str.length()-1) {
				sb.append(curChar);
				if(count != 1) {
					sb.append(count);
				}
			}
		}
		
		return sb.toString();
	}
	
	public String solution(String str) {
		//���� ���̵��: ���ڿ� for��(���ڿ� ����-1��ŭ�� ����) ������ i�� i+1��° ���ڸ� ���Ѵ�. ������ ���ڿ��� ������ ���� �ʵ��� str ���� �� ���ڸ� �߰��Ѵ�. �������� ���� ���.
		//Ȯ���� ����ϳ�.. ���� �� ���� ������ �ʱ�ȭ����? i�� i+1 �񱳰� �� ����.
		StringBuilder sb = new StringBuilder();
		str = str + " ";
		int cnt = 1;
		for(int i=0; i<str.length()-1; i++) {
			char curChar = str.charAt(i);
			if(curChar == str.charAt(i+1)) {
				cnt++;
			} else {
				sb.append(curChar);
				if(cnt > 1) {
					sb.append(cnt);
				}
				cnt = 1;
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		EX11_CompressedWord cw = new EX11_CompressedWord();
		
		Scanner sc = new Scanner(System.in);
		String iptStr = sc.nextLine();
		System.out.println(cw.solution(iptStr));
	}
}
