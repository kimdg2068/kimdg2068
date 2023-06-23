package com.inflearn.section1;

import java.util.Scanner;

public class EX12_DecryptingPw {
	/*
		설명
		현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
		비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
		비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
		만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
		1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
		2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
		3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
		참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
		현수가 4개의 문자를 다음과 같이 신호로 보냈다면
		#****###**#####**#####**##**
		이 신호를 4개의 문자신호로 구분하면
		#****## --> 'C'
		#**#### --> 'O'
		#**#### --> 'O'
		#**##** --> 'L'
		최종적으로 “COOL"로 해석됩니다.
		현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.
		
		문제 해석
		==> 영희의 암호는 7자씩 나누어 해석해야 한다.
		==> 변환 과정1. #은 이진수의 1로, *이진수의 0로 변환하여 7자의 2진수로 변환.
		==> 변환 과정2. 2진수를 10진수로 변환.
		==> 해당 아스키 번호의 문자신호를 이어붙여 출력.
		
		1. 문자 개수 횟수만큼 암호를 7자씩 나누고 2진수로 변환, 10진 수로 변환한 뒤 StringBuilder 저장한다.
		2. 해당 아스키번호를 출력한다.
		
		입력
		첫 줄에는 보낸 문자의 개수(10을 넘지 안습니다)가 입력된다. 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다.
		현수는 항상 대문자로 해석할 수 있는 신호를 보낸다고 가정합니다.
		출력
		영희가 해석한 문자열을 출력합니다.
	 */
	
	public String mySol(int cnt, String str) {
		//내 아이디어: 문자를 7자씩 끊어 읽는 동시에 2진수 -> 10진수 변환 후 StringBuilder에 추가.
		//외부 for문에서 #->1, *->0 으로 2진수 변환 후 내부 for문에서 (sum = sum*2 + 해당 자리 2진수) 수식을 통해 10진수 변환
		//sum을 char로 변환한 뒤 StringBuilder에 저장.
		StringBuilder ans = new StringBuilder();
		
		int sum;
		for(int i=0; i<cnt; i++) {
			sum = 0;
			String subStr = str.substring(i*7, i*7+7);
			for(int j=0; j<7; j++) {
				char cha = subStr.charAt(j);
				int convToNum = 0;
				if(cha == '#') {
					convToNum = 1;
				} else {
					convToNum = 0;
				}
				sum = sum * 2 + convToNum;
			}
			ans.append((char)sum);
		}
		
		
		return ans.toString();
	}
	
	public String solution(int cnt, String str) {
		//인강 아이디어: 7자씩 끊어서 암호 > 2진수 > 10진수 변환 바로 해서 String에 추가한다.
		//아이디어 자체는 비슷한데 7자씩 끊어서 해석한 암호는 제거했고, 암호 > 2진수 변환은 replace 함수를 이용하고 2진수 > 10진수 변환은 parseInt를 이용했음.
		//코드가 훨씬 짧고 가독성도 좋다. 변수도 필요없어지고.. 함수를 잘 써야해. 효율도 더 좋은가? 챗gpt한테 물어봐야겠음.
		//이 코드가 가독성 완승인 거 이해했고, 변수 안 쓰니까 메모리도 절약하고 parseInt 쓰니까 시간복잡도 관점에서도 좋네.. 쥑인다.
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<cnt; i++) {
			String subStr = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int convNum = Integer.parseInt(subStr, 2);
			ans.append((char)convNum);
			str = str.substring(7);
		}
		
		return ans.toString();
	}

	public static void main(String[] args) {
		EX12_DecryptingPw dpw = new EX12_DecryptingPw();
		
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		String inputStr = sc.nextLine();
		System.out.println(dpw.solution(cnt, inputStr));
	}
}
