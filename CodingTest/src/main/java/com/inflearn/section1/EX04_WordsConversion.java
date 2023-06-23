package com.inflearn.section1;

import java.util.Scanner;

public class EX04_WordsConversion {
	/*
		����
		N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		�Է�
		ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
		�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	*/
	public String solution(String str) {
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int lt = 0;
		int rt = chars.length-1;
		while(lt < rt) {
			char tmp = chars[lt];
			chars[lt] = chars[rt];
			chars[rt] = tmp;
			lt++;
			rt--;
		}
		sb.append(chars);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		EX04_WordsConversion m = new EX04_WordsConversion();
		
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		String inputStr;
		for(int i=0; i<count; i++) {
			inputStr = sc.nextLine();
			System.out.println(m.solution(inputStr));
		}
	}
}
