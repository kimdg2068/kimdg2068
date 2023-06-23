package com.inflearn.section1;

import java.io.IOException;
import java.util.Scanner;

public class Ex01_FindChar {
	/*
	    ����
		�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
		��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
		
		�Է�
		ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
		���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	 */
	public int solution(String str, char c) {
		int answer = 0;
		
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
		for(char cha : str.toCharArray()) {
			if(cha == c) answer++;
		}
		
		return answer; 
	}
	
	public static void main(String[] args) throws IOException {
		Ex01_FindChar fc = new Ex01_FindChar();
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		char inputChar = sc.next().charAt(0);
		
		System.out.println(fc.solution(inputStr, inputChar));
	}
}
