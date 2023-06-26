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
	public boolean myIsPrime(int num) {
		boolean isPrime = true;
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public String mySol(int cnt, String[] iptStrs) {
		//내 아이디어: for문 돌면서 String 배열 원소들을 sb에 추가한 뒤 reverse. 그 문자열을 parseInt시키고 에라토스테네스 체 써서 소수인지 판별.
		//에라토스테네스 체 쓰니까 런타임 에러나는데 내가 뭔가 잘못한듯..?
		//그냥 num 제곱근 이하에서 약수 찾는 방식으로 돌려보자. -> 정답임..
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<cnt; i++) {
			StringBuilder str = new StringBuilder();
			int num = Integer.parseInt(str.append(iptStrs[i]).reverse().toString());
			
			if(num > 1) {
				if(myIsPrime(num)) ans.append(num + " ");
			}
		}
		
		return ans.toString();
	}
	
	public String solution(int[] arr) {
		//인강 아이디어: %와 / 이용해서 입력된 수 일의 자리에 10 곱해서 더하는 식으로 뒤집어진 수 만듦.
		//소수 판별은 그냥 자기자신까지 for문 돌려서 약수 찾는 방식으로 했네. 제곱근이 낫겠다.
		StringBuilder ans = new StringBuilder();
		for(int n : arr) {
			int res = 0;
			while(n > 0) {
				res = res * 10 + n % 10;
				n = n / 10;
			}
			if(res > 1) {
				if(myIsPrime(res)) ans.append(res + " ");
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		EX06_FlippedPrimeNum fpn = new EX06_FlippedPrimeNum();
		
		Scanner sc = new Scanner(System.in);
//		int cnt = Integer.parseInt(sc.nextLine());
//		String[] iptStrs = sc.nextLine().split(" ");
//		System.out.println(fpn.mySol(cnt, iptStrs));
		int cnt = sc.nextInt();
		int[] arr = new int[cnt]; 
		for(int i=0; i<cnt; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(fpn.solution(arr));
	}
}
