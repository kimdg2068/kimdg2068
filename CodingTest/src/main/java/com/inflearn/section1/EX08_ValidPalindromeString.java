package com.inflearn.section1;

import java.util.Scanner;

public class EX08_ValidPalindromeString {
	/*
	   설명
		앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
		문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
		단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
		알파벳 이외의 문자들의 무시합니다.
		
		입력
		첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
		
		출력
		첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
	 */
	
	public String mySol(String str) {
		//내 아이디어: lt, rt 이용: lt가 알파벳X lt++, rt가 알파벳X rt--, lt랑 rt 모두 알파벳O toUpperCase로 같은지 비교.
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
		// 강의 아이디어: 정규식을 사용해서 알파벳이 아닌 문자는 문자열에서 제거해버림. 죽인다.
		// replace는 정규식 사용 불가하므로 replaceAll 사용해야 함.
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
