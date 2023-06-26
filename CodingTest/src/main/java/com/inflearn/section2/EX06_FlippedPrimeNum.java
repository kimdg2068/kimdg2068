package com.inflearn.section2;

import java.util.Scanner;

public class EX06_FlippedPrimeNum {
	/*
	 	����
		N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ �� �� ������ ���� �Ҽ��̸� �� �Ҽ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
		���� ��� 32�� �������� 23�̰�, 23�� �Ҽ��̴�. �׷��� 23�� ����Ѵ�. �� 910�� �������� 19�� ����ȭ �ؾ� �Ѵ�.
		ù �ڸ������� ���ӵ� 0�� �����Ѵ�.
		�Է�
		ù �ٿ� �ڿ����� ���� N(3<=N<=100)�� �־�����, �� ���� �ٿ� N���� �ڿ����� �־�����.
		�� �ڿ����� ũ��� 100,000�� ���� �ʴ´�.
		���
		ù �ٿ� ������ �Ҽ��� ����մϴ�. ��¼����� �Էµ� ������� ����մϴ�.
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
		//�� ���̵��: for�� ���鼭 String �迭 ���ҵ��� sb�� �߰��� �� reverse. �� ���ڿ��� parseInt��Ű�� �����佺�׳׽� ü �Ἥ �Ҽ����� �Ǻ�.
		//�����佺�׳׽� ü ���ϱ� ��Ÿ�� �������µ� ���� ���� �߸��ѵ�..?
		//�׳� num ������ ���Ͽ��� ��� ã�� ������� ��������. -> ������..
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
		//�ΰ� ���̵��: %�� / �̿��ؼ� �Էµ� �� ���� �ڸ��� 10 ���ؼ� ���ϴ� ������ �������� �� ����.
		//�Ҽ� �Ǻ��� �׳� �ڱ��ڽű��� for�� ������ ��� ã�� ������� �߳�. �������� ���ڴ�.
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
