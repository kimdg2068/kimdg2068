package com.inflearn.section2;

import java.util.Scanner;

public class EX04_FibonacciNums {
	/*
	 	설명
		1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
		2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
		입력
		첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
		출력
		첫 줄에 피보나치 수열을 출력합니다.
	 */
	
	public int[] mySol(int cnt) {
		//내 아이디어: 크기가 cnt인 배열에 1,1,2를 넣어두고 반복문을 돌려 i=3부터 i-1 + i-2 결과로 초기화.
		//강의 아이디어: 똑같은데 1,1만 넣고 i=2부터 돌리면 됨. 그러네?
		int[] ans = new int[cnt];
		ans[0] = 1;
		ans[1] = 1;
		ans[2] = 2;
		
		for(int i=3; i<cnt; i++) {
			ans[i] = ans[i-1] + ans[i-2];
		}
		return ans;
	}

	public static void main(String[] args) {
		EX04_FibonacciNums fn = new EX04_FibonacciNums();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int n : fn.mySol(cnt)) {
			System.out.print(n + " ");
		}
	}

}
