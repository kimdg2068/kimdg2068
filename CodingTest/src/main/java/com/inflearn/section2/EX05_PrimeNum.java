package com.inflearn.section2;

import java.util.Scanner;

public class EX05_PrimeNum {
	/*
		설명
		자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
		만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
		입력
		첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
		출력
		첫 줄에 소수의 개수를 출력합니다.
	 */
	public int mySol(int cnt) {
		//내 아이디어: 입력된 수의 제곱근까지 for문을 돌려서 한번도 약수가 존재하지 않는 수마다 ans++
		int ans = 0;
		for(int i=2; i<=cnt; i++) {
			boolean isPrime = true;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) ans++;
		}

		return ans;
	}
	
	public int solution(int cnt) {
		//인강 아이디어: 에라토스테네스 체 -> cnt+1 길이의 char배열을 만든다. i=2부터 for문을 돌려서 원소가 0이라면 해당 i의 배수인 인덱스 원소++.  
		int ans = 0;
		int[] arr = new int[cnt+1];
		for(int i=2; i<cnt+1; i++) {
			if(arr[i] == 0) {
				ans++;
				for(int j=2*i; j<cnt+1; j+=i) {
					arr[j]++;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		EX05_PrimeNum pn = new EX05_PrimeNum();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		System.out.println(pn.solution(cnt));
	}
}
