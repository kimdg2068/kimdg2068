package com.inflearn.section2;

import java.util.Scanner;

public class EX06_FlippedPrimeNum {
	/*
	 	설명
		N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
		예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
		첫 자리부터의 연속된 0은 무시한다.
		입력
		첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
		각 자연수의 크기는 100,000를 넘지 않는다.
		출력
		첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
	 */
	public boolean isPrime(int num) {
		int[] arr = new int[num+1];
		for(int i=2; i<num+1; i++) {
			if(arr[i] == 0) {
				for(int j=i*i; j<num+1; j+=i) {
					arr[j]++;
				}
			}
		}
		if(arr[num] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public String mySol(int cnt, String[] iptStrs) {
		//내 아이디어: for문 돌면서 String 배열 원소들을 sb에 추가한 뒤 reverse. 그 문자열을 parseInt시키고 에라토스테네스 체 써서 소수인지 판별.
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<cnt; i++) {
			StringBuilder str = new StringBuilder();
			int num = Integer.parseInt(str.append(iptStrs[i]).reverse().toString());
			
			if(num != 1) {
				if(isPrime(num)) ans.append(num + " ");
			}
		}
		
		return ans.toString();
	}

	public static void main(String[] args) {
		EX06_FlippedPrimeNum fpn = new EX06_FlippedPrimeNum();
		
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		String[] iptStrs = sc.nextLine().split(" ");
		System.out.println(fpn.mySol(cnt, iptStrs));
	}
}
