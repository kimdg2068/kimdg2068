package com.inflearn.section2;

import java.util.Scanner;

public class EX05_PrimeNum {
	/*
		����
		�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.
		�Է�
		ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.
		���
		ù �ٿ� �Ҽ��� ������ ����մϴ�.
	 */
	public int mySol(int cnt) {
		//�� ���̵��: �Էµ� ���� �����ٱ��� for���� ������ �ѹ��� ����� �������� �ʴ� ������ ans++
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
		//�ΰ� ���̵��: �����佺�׳׽� ü -> cnt+1 ������ char�迭�� �����. i=2���� for���� ������ ���Ұ� 0�̶�� �ش� i�� ����� �ε��� ����++.  
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
