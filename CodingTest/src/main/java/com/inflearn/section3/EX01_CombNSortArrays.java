package com.inflearn.section3;

import java.util.Scanner;

public class EX01_CombNSortArrays {
	/*
	 	����
		������������ ������ �� �� �迭�� �־����� �� �迭�� ������������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
		�Է�
		ù ��° �ٿ� ù ��° �迭�� ũ�� N(1<=N<=100)�� �־����ϴ�.
		�� ��° �ٿ� N���� �迭 ���Ұ� ������������ �־����ϴ�.
		�� ��° �ٿ� �� ��° �迭�� ũ�� M(1<=M<=100)�� �־����ϴ�.
		�� ��° �ٿ� M���� �迭 ���Ұ� ������������ �־����ϴ�.
		�� ����Ʈ�� ���Ҵ� int�� ������ ũ�⸦ ���� �ʽ��ϴ�.
		���
		������������ ���ĵ� �迭�� ����մϴ�.
	 */
	
	public String mySol(int[] arr1, int[] arr2) {
		StringBuilder sb = new StringBuilder();
		int[] sortArr = new int[arr1.length+arr2.length];
		
		
		return sb.toString();
	}

	public static void main(String[] args) {
		EX01_CombNSortArrays csa = new EX01_CombNSortArrays();
		
		Scanner sc = new Scanner(System.in);
		int len1 = sc.nextInt();
		int[] arr1 = new int[len1];
		for(int i=0; i<len1; i++) {
			arr1[i] = sc.nextInt();
		}
		int len2 = sc.nextInt();
		int[] arr2 = new int[len2];
		for(int i=0; i<len2; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println(csa.mySol(arr1, arr2));
	}

}
