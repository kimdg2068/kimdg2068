package com.inflearn.codingTest.section1_String;

import java.util.ArrayList;
import java.util.Scanner;

public class EX10_FindShortestDistance {
	/*
	 	설명
		한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
		
		입력
		첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
		문자열의 길이는 100을 넘지 않는다.
		
		출력
		첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
	 */
	
	public String mySol(String str, char cha) {
		/*
		 * 내 아이디어
		 * 1. 문자t의 모든 idx를 구해서 int[]에 집어넣는다.
		 * 2. i와 int[]의 idx의 차를 구해서 최소값을 StringBuilder에 추가한다.(1이 나오면 바로 종료)
		 * --> str.charAt(i)가 cha와 같은 경우는 sb에 바로 0 추가
		 */
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> charIdxs = new ArrayList<Integer>();
		int idx = 0;
		while(true) {
			idx = str.indexOf(cha, idx);
			if(idx == -1) {
				break;
			}
			charIdxs.add(idx);
			idx++;
		}
		
		for(int i=0; i<str.length(); i++) {
			int minDis = 99;
			if(str.charAt(i) == cha) {
				minDis = 0;
			} else {
				for(int j=0; j<charIdxs.size(); j++) {
					int diff = Math.abs(i - charIdxs.get(j));
					if(minDis > diff) {
						minDis = diff;
					}
					if(minDis == 1) {
						break;
					}
				}
			}
			sb.append(minDis + " ");
		}
		
		return sb.toString();
	}
	
	public int[] solution(String str, char cha) {
		//인강 아이디어: 거리값을 설정해놓고 문자열에서 cha를 만날 때마다 0으로 초기화, 아닐 경우 +1
		//위 과정을 문자열 왼쪽부터 한번, 오른쪽부터 한번 반복해서 최소 거리를 찾음
		//각 문자가 자신의 왼쪽에 있는 cha와 오른쪽에 있는 cha와의 거리차를 비교하게 되므로 최소 거리를 찾을 수 있음.
		//문자열 길이만큼 두번만 돌아서 답 도출할 수 있네.. 쥑인다 근데 나 왜 list 썼냐ㅋㅋㅋㅋ
		int[] ans = new int[str.length()];
		int minDis = 99;
		for(int i=0; i<ans.length; i++) {
			if(str.charAt(i) == cha) minDis = 0;
			else minDis++;
			ans[i] = minDis;
		}
		for(int i=ans.length-1; i>=0; i--) {
			if(str.charAt(i) == cha) minDis = 0;
			else minDis++;
			ans[i] = Math.min(ans[i], minDis);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		EX10_FindShortestDistance fsd = new EX10_FindShortestDistance();
		
		Scanner sc = new Scanner(System.in);
		String iptStr = sc.next();
		char iptChar = sc.next().charAt(0);
		//System.out.println(fsd.mySol(iptStr, iptChar));
		for(int n : fsd.solution(iptStr, iptChar)) {
			System.out.print(n + " ");
		}
	}
}
