package com.inflearn.section1;

import java.util.Scanner;

public class EX07_PalindromeString {
	/*
	    설명
		앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
		문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
		단 회문을 검사할 때 대소문자를 구분하지 않습니다.
		
		입력
		첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
		
		출력
		첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
	 */
	
	public String mySolution(String str) {
		//내 아이디어: string 대문자로 바꿔버리고 lt, rt 비교해서 다르면 break&NO, 나머지는 answer 출력.
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
		//강의 아이디어1: 문자열 길이 절반만 for문 돌려서 인덱스 i vs str.length()-1-i 비교
		//for문 절반만 돌리면 되고 변수 따로 선언할 필요 없어서 좋음.
		//원래 나였으면 이렇게 풀었을 것 같은데.. 직전에 들은 지식 써먹고 싶어지면 다른 방법이 영 안 떠오르네..
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
		//강의 아이디어2: 어차피 뒤집어야 하니까 StringBuilder reverse와 equalsIgnoreCase 사용해서 비교하자.
		//맞네 equalsIgnoreCase 옛날에 배웠었음. 역시 기초가 중요하다. 이런 간단한 문제 푸는데 효율이 다르네..
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
