package com.inflearn.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class EX01_PrintBiggerNum {
	/*
		 설명
		N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
		(첫 번째 수는 무조건 출력한다)
		입력
		첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
		출력
		자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
	 */
	
	public String mySol(int cnt, String str) {
		//내 아이디어: split을 통해 str로 String 배열을 만든다. 첫 숫자는 ans에 추가하고 배열 i(i는 1부터)와 i-1을 비교해서 i가 크다면 ans에 추가한다.
		StringBuilder ans = new StringBuilder();
		String[] arr =  str.split(" ");
		
		ans.append(arr[0] + " ");
		for(int i=1; i<cnt; i++) {
			int num = Integer.parseInt(arr[i]);
			if(num > Integer.parseInt(arr[i-1])) ans.append(num + " ");
		}
		
		return ans.toString();
	}
	
	public ArrayList<Integer> solution(int cnt, int[] arr) {
		//인강 아이디어: Scanner로 입력받자마자 Integer로 변환해서 배열에 집어넣은 뒤 조건을 만족하는 숫자만 ArrayList에 추가하여 출력
		//나는 공백이 포함되면 split이나 StringTokenizer로 쪼개는 습관이 있는데 숫자일 때는 그냥 바로 배열에 집어넣는 게 효율적이네..
		//데이터에 공백을 추가해서 출력해야 하는 문제에서 굳이 StringBuilder 쓰지 말자.. StringBuilder 처돌이니? 
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(arr[0]);
		for(int i=1; i<cnt; i++) {
			if(arr[i] > arr[i-1]) ans.add(arr[i]);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		EX01_PrintBiggerNum pbn = new EX01_PrintBiggerNum();
		
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		int[] arr = new int[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = sc.nextInt();
		}
		for(int n : pbn.solution(cnt, arr)) {
			System.out.print(n + " ");
		}
//		String iptStr = sc.nextLine();
//		System.out.println(pbn.mySol(cnt, iptStr));
	}
}
