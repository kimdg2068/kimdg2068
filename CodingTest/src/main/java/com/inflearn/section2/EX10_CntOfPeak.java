package com.inflearn.section2;

import java.util.Arrays;
import java.util.Scanner;

public class EX10_CntOfPeak {
	/*
	 	���� ������ N*N �����ǿ� �־����ϴ�. �� ���ڿ��� �� ������ ���̰� �����ֽ��ϴ�.
		�� �������� ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮 �����Դϴ�. ���츮 ������ �� �� �ִ� �� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
		������ �����ڸ��� 0���� �ʱ�ȭ �Ǿ��ٰ� �����Ѵ�.
		���� N=5 �̰�, �������� ���ڰ� ������ ���ٸ� ���츮�� ������ 10���Դϴ�.
		�Է�
		ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
		�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.
		���
		���츮�� ������ ����ϼ���.
	 */
	
	public int mySol(int cnt, int[][] arr) {
		int ans = 0;
		
		return ans;
	}

	public static void main(String[] args) {
		EX10_CntOfPeak cop = new EX10_CntOfPeak();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] arr = new int[cnt+2][cnt+2];
		for(int i=1; i<cnt+1; i++) {
			for(int j=1; j<cnt+1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<cnt+2; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
