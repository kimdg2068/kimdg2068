package com.inflearn.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class EX01_PrintBiggerNum {
	/*
		 ����
		N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
		(ù ��° ���� ������ ����Ѵ�)
		�Է�
		ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.
		���
		�ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.
	 */
	
	public String mySol(int cnt, String str) {
		//�� ���̵��: split�� ���� str�� String �迭�� �����. ù ���ڴ� ans�� �߰��ϰ� �迭 i(i�� 1����)�� i-1�� ���ؼ� i�� ũ�ٸ� ans�� �߰��Ѵ�.
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
		//�ΰ� ���̵��: Scanner�� �Է¹��ڸ��� Integer�� ��ȯ�ؼ� �迭�� ������� �� ������ �����ϴ� ���ڸ� ArrayList�� �߰��Ͽ� ���
		//���� ������ ���ԵǸ� split�̳� StringTokenizer�� �ɰ��� ������ �ִµ� ������ ���� �׳� �ٷ� �迭�� ����ִ� �� ȿ�����̳�..
		//�����Ϳ� ������ �߰��ؼ� ����ؾ� �ϴ� �������� ���� StringBuilder ���� ����.. StringBuilder ó���̴�? 
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
