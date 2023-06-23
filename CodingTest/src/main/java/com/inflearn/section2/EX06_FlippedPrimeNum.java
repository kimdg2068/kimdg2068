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
		//�� ���̵��: for�� ���鼭 String �迭 ���ҵ��� sb�� �߰��� �� reverse. �� ���ڿ��� parseInt��Ű�� �����佺�׳׽� ü �Ἥ �Ҽ����� �Ǻ�.
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
