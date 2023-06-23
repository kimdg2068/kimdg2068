package com.inflearn.section2;

import java.util.Scanner;

public class EX03_RockScissorsPaper {
	/*
	 * 설명
		A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
		가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
		두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
		입력
		첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
		두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
		세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
		출력
		각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다. 
	 */
	
	public String mySol(int cnt, int[] infoA, int[] infoB) {
		//내 아이디어: A와 B의 정보를 공백 기준으로 쪼개서 가위바위보 승패를 비교하고 StringBuilder에 저장.
		//for문 한번만 돌리면 되니까 효율적이지 않나? 약간 애매한 건 String 객체를 많이 생성하는 거? 그냥 for문 두번이 낫나?
		//for문 한번만 돌려도 되겠다. cnt*2만큼 돌리고 i 기준으로 cnt-1까지는 a배열에 넣고 나머지는 b배열에 넣으면.. 
		//가위바위보 승패의 경우 같으면 sb에 D 추가, 차이가 1인 경우 큰 쪽 추가, 차이가 2인 경우 작은 쪽 추가
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<cnt; i++) {
			int numA = infoA[i];
			int numB = infoB[i];
			int diff = Math.abs(numA - numB);
			char result = 'D';
			if(diff == 1) {
				if(numA > numB) result = 'A';
				else result = 'B';
			} else if(diff == 2) {
				if(numA < numB) result = 'A';
				else result = 'B';
			}
			sb.append(result);
		}
		
		return sb.toString();
	}
	
	public String solution(int cnt, int[] infoA, int[] infoB) {
		//강의 아이디어: int 배열 두개 만든 뒤, a b 같은 경우는 'D', a=1, b=3/a=2, b=1/a=3, b=2의 경우는 'A', 나머지는 'B'를 더함.
		//그냥 모든 조건 다 쓰네. 나는 조건을 줄이려고 했는데 그럼 또 변수가 생기고.. 뭐가 효율적인 거지?
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<cnt; i++) {
			if(infoA[i] == infoB[i]) sb.append("D");
			else if(infoA[i] == 1 && infoB[i] == 3) sb.append("A");
			else if(infoA[i] == 2 && infoB[i] == 1) sb.append("A");
			else if(infoA[i] == 3 && infoB[i] == 2) sb.append("A");
			else sb.append("B");
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		EX03_RockScissorsPaper rsp = new EX03_RockScissorsPaper();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] infoA = new int[cnt];
		int[] infoB = new int[cnt];
		for(int i=0; i<cnt*2; i++) {
			if(i < cnt) {
				infoA[i] = sc.nextInt();
			} else {
				infoB[i-cnt] = sc.nextInt();
			}
		}
//		for(char c : rsp.mySol(cnt, infoA, infoB).toCharArray()) {
//			System.out.println(c);
//		}
		for(char c : rsp.solution(cnt, infoA, infoB).toCharArray()) {
			System.out.println(c);
		}
	}
}
