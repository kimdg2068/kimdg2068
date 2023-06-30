package com.inflearn.section3;

import java.util.Scanner;

public class EX01_CombNSortArrays {
	/*
	 	설명
		오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
		입력
		첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
		두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
		세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
		네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
		각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
		출력
		오름차순으로 정렬된 배열을 출력합니다.
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
