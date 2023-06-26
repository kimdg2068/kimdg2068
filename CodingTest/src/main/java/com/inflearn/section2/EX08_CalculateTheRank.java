package com.inflearn.section2;

import java.util.Scanner;

public class EX08_CalculateTheRank {
	/*
	 	설명
		N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
		같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
		즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
		입력
		첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
		출력
		입력된 순서대로 등수를 출력한다
	 */
	
	public String mySol(int cnt, int[] scores) {
		//내 아이디어: 이중 for문으로 자기 제외한 모든 원소와 비교해서 자기보다 큰 점수가 있으면 rank++해서 StringBuilder에 추가.
		StringBuilder ans = new StringBuilder();
		int rank;
		for(int i=0; i<cnt; i++) {
			rank = 1;
			int curNum = scores[i];
			for(int j=0; j<cnt; j++) {
				if(curNum < scores[j]) rank++;
			}
			ans.append(rank + " ");
		}
		
		return ans.toString();
	}

	public static void main(String[] args) {
		EX08_CalculateTheRank cr = new EX08_CalculateTheRank();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] scores = new int[cnt];
		for(int i=0; i<cnt; i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println(cr.mySol(cnt, scores));
	}
}
