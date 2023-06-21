package com.inflearn.codingTest.section1_String;

import java.util.Scanner;

public class EX11_CompressedWord {
	/*
	 	설명
		알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
		문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
		단 반복횟수가 1인 경우 생략합니다.
		입력
		첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
		출력
		첫 줄에 압축된 문자열을 출력한다
	 */
	
	public String mySol(String str) {
		//내 아이디어: 
		//첫 문자 초기화하여 str.charAt(i)와 비교, 같으면 count++ 다르면 sb에 이전 문자와 count값 추가(count 1이면 생략), 변수 현 문자로 count 1로 초기화
		//이전 문자와 현 문자를 비교하여 이전 문자를 sb에 추가하므로 마지막 문자 처리를 따로 해줘야 함.
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
		//강의 아이디어: 문자열 for문(문자열 길이-1만큼만 돌림) 돌려서 i와 i+1번째 문자를 비교한다. 마지막 문자에서 에러가 나지 않도록 str 끝에 빈 문자를 추가한다. 나머지는 나랑 비슷.
		//확실히 깔끔하네.. 나는 왜 굳이 변수로 초기화했지? i랑 i+1 비교가 더 낫다.
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
